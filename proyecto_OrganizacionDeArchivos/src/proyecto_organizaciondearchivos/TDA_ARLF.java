package proyecto_organizaciondearchivos;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class TDA_ARLF {

    private final File file;
    private static RandomAccessFile flujo;
    private static LinkedList list;
    private static int header;
    private static final int headerSize = Integer.BYTES;
    private static ArbolB arbolito;
    
    public TDA_ARLF(File file) throws IOException {
        this.file = file;
        if (file.exists() && !file.isFile()) {
            throw new IOException(file.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(file, "rw");
        list = new LinkedList();
        arbolito = new ArbolB();
        flujo.seek(0);
        try {
            if (file.length() > 0) {
                header = flujo.readInt();
                if (header != -1) {
                    list.add(header);
                    Record record = new Record();
                    flujo.seek(0 + headerSize);
                    while (true) {
                        flujo.seek((header - 1) * record.sizeOf() + headerSize);
                        flujo.readChar();
                        header = flujo.readInt();
                        if (header != -1) {
                            list.add(0, header);
                        }
                    }
                }
            } else {
                flujo.writeInt(-1);
            }
        } catch (Exception e) {

        }
    }

    public boolean insert(Record record) {
        boolean created = false;
        indice posicion = new indice();
        posicion = arbolito.search(record.getId());
        if (posicion != null) {
            return false;
        } else {
            try {
                flujo.seek(0 + headerSize);
                while (true) {
                    if (list.isEmpty()) {
                        created = true;
                        flujo.seek(file.length());
                        flujo.writeChar(record.getBorrado());
                        flujo.writeInt(0);
                        flujo.writeInt(record.getId());
                        flujo.writeUTF(record.getName());
                        flujo.writeUTF(record.getBirthdate());
                        flujo.writeFloat(record.getSalary());
                        arbolito.insert(new indice(record.getId(), (int) file.length()/record.sizeOf()));
                        break;
                    } else {
                        flujo.seek(0);
                        created = true;
                        int pos = (int) list.remove(0);
                        int ref = 0;
                        flujo.seek(record.sizeOf() * (pos - 1) + headerSize);
                        flujo.readChar();
                        ref = flujo.readInt();
                        flujo.seek(0);
                        flujo.writeInt(ref);
                        flujo.seek(record.sizeOf() * (pos - 1) + headerSize);
                        flujo.writeChar(record.getBorrado());
                        flujo.writeInt(0);
                        flujo.writeInt(record.getId());
                        flujo.writeUTF(record.getName());
                        flujo.writeUTF(record.getBirthdate());
                        flujo.writeFloat(record.getSalary());
                        arbolito.insert(new indice(record.getId(), pos));
                        break;
                    }
                }
            } catch (Exception e) {

            }
        }
        return created;
    }

    public boolean delete(int id) throws IOException {
        Record record = new Record();
        boolean found = false;
        indice rrn = new indice();
        rrn = arbolito.search(id);
        System.out.println(rrn.getId());
        System.out.println(rrn.getRrn());
        try {
            if (rrn == null) {
                return found;
            } else {
                flujo.seek((rrn.getRrn() - 1) * record.sizeOf() + headerSize);
                record.setBorrado(flujo.readChar());
                if (record.getBorrado() != '*') {
                    found = true;
                    record.setBorrado('*');
                    flujo.seek(0);
                    header = flujo.readInt();
                    if (header == -1) {
                        flujo.seek(0);
                        flujo.writeInt(rrn.getRrn());
                        flujo.seek((rrn.getRrn() - 1) * record.sizeOf() + headerSize);
                        flujo.writeChar(record.getBorrado());
                        flujo.writeInt(header);
                        list.add(0, rrn.getRrn());
                        arbolito.delete(rrn.getId());
                    } else {
                        flujo.seek(0);
                        flujo.writeInt(rrn.getRrn());
                        flujo.seek((rrn.getRrn() - 1) * record.sizeOf() + headerSize);
                        flujo.writeChar(record.getBorrado());
                        flujo.writeInt(header);
                        list.add(0, rrn.getRrn());
                        arbolito.delete(rrn.getId());
                    }
                    return found;
                }
            }

        } catch (EOFException e) {

        }
        return found;
    }

    public Record search(int id) throws IOException {
        indice pos = new indice();
        pos = arbolito.search(id);
        Record buscado = new Record();
        if (pos == null) {
            return null;
        } else {
            flujo.seek((pos.getRrn() - 1) * buscado.sizeOf() + headerSize);
            buscado.setBorrado(flujo.readChar());
            buscado.setReferencia(flujo.readInt());
            buscado.setId(flujo.readInt());
            buscado.setName(flujo.readUTF());
            buscado.setBirthdate(flujo.readUTF());
            buscado.setSalary(flujo.readFloat());
            return buscado;
        }
    }

    public boolean modify(Record neoRecord, int id) throws IOException {
        indice pos = new indice();
        pos = arbolito.search(id);
        System.out.println(pos.getId());
        if (pos == null) {
            return false;
        } else if (pos.getId() != neoRecord.getId()) {
            flujo.seek((pos.getRrn() - 1) * neoRecord.sizeOf() + headerSize);
            flujo.writeChar(neoRecord.getBorrado());
            flujo.writeInt(neoRecord.getReferencia());
            flujo.writeInt(neoRecord.getId());
            flujo.writeUTF(neoRecord.getName());
            flujo.writeUTF(neoRecord.getBirthdate());
            flujo.writeFloat(neoRecord.getSalary());
            arbolito.delete(id);
            arbolito.insert(pos);
            return true;
        } else {
            flujo.seek((pos.getRrn() - 1) * neoRecord.sizeOf() + headerSize);
            flujo.writeChar(neoRecord.getBorrado());
            flujo.writeInt(neoRecord.getReferencia());
            flujo.writeInt(neoRecord.getId());
            flujo.writeUTF(neoRecord.getName());
            flujo.writeUTF(neoRecord.getBirthdate());
            flujo.writeFloat(neoRecord.getSalary());
            return true;
        }
    }

    public DefaultTableModel listar(DefaultTableModel model) {
        try {
            while (model.getRowCount() > 0) {
                model.removeRow(0);
            }
            Record record = new Record();
            flujo.seek(0 + headerSize);
            while (true) {
                record.setBorrado(flujo.readChar());
                record.setReferencia(flujo.readInt());
                record.setId(flujo.readInt());
                record.setName(flujo.readUTF());
                record.setBirthdate(flujo.readUTF());
                record.setSalary(flujo.readFloat());
                if (record.getBorrado() != '*') {
                    model.addRow(new Object[]{record.getId(), record.getName(), record.getBirthdate(), record.getSalary()});
                }
            }
        } catch (Exception e) {
        }
        return model;
    }

    public void escribir() {
        FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream("Arbolito.b");
            bw = new ObjectOutputStream(fw);
            bw.writeObject(arbolito);
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

    public boolean cargar() {
        FileInputStream inFile;
        try {
            inFile = new FileInputStream("Arbolito.b");
            ObjectInputStream inputObject = new ObjectInputStream(inFile);
            Object objeto = inputObject.readObject();
            if (objeto instanceof ArbolB) {
                arbolito = (ArbolB) objeto;
                return true;
            }
        } catch (FileNotFoundException ex) {
        } catch (IOException | ClassNotFoundException ex) {
        }
        return false;
    }

}
