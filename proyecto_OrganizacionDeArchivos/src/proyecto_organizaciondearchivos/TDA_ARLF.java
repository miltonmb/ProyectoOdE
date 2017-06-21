package proyecto_organizaciondearchivos;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;

public class TDA_ARLF {

    private final File file;
    private static RandomAccessFile flujo;
    private static LinkedList list;
    private static int header;
    private static final int headerSize = Integer.BYTES;
    private static final int sizeOf = Integer.BYTES + Character.BYTES + Integer.BYTES + (Character.BYTES + 40) + (Character.BYTES + 10) + Float.BYTES;

    public TDA_ARLF(File file) throws IOException {
        this.file = file;
        if (file.exists() && !file.isFile()) {
            throw new IOException(file.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(file, "rw");
        list = new LinkedList();
        flujo.seek(0);
        //flujo.writeInt(-1);

        try {
            if (file.length() > 0) {
                header = flujo.readInt();
                if (header != -1) {
                    list.add(header);
                    Record record = new Record();
                    flujo.seek(0 + headerSize);
                    while (true) {
                        System.out.println(flujo.getFilePointer());
                        record.setBorrado(flujo.readChar());
                        record.setReferencia(flujo.readInt());
                        record.setId(flujo.readInt());
                        System.out.println(record.getId());
                        record.setName(flujo.readUTF());
                        System.out.println(record.getName());
                        record.setBirthdate(flujo.readUTF());
                        record.setSalary(flujo.readFloat());
                        System.out.println(record.getBirthdate());
                        flujo.seek((header - 1) * record.sizeOf() + headerSize);
                        flujo.readChar();
                        header = flujo.readInt();
                        System.out.println(header);
                        if(header != -1){
                            list.add(0,header);
                        }
                    }
                }
            } else {
                System.out.println("ENTRO AQUI");
                flujo.writeInt(-1);
            }
        } catch (Exception e) {
        }
        System.out.println("AQUI JEJE");
        for (Object object : list) {
            System.out.println("RRN:" + (int) object);
        }

    }

    public boolean insert(Record record) {
        boolean created = false;
        try {
            flujo.seek(0 + headerSize);
            while (true) {
                if (list.isEmpty()) {
                    created = true;
                    flujo.seek(file.length());
                    flujo.writeChar(record.getBorrado());
                    flujo.writeInt(record.getReferencia());
                    flujo.writeInt(record.getId());
                    flujo.writeUTF(record.getName());
                    flujo.writeUTF(record.getBirthdate());
                    flujo.writeFloat(record.getSalary());
                    break;
                } else {

                    created = true;
                    int pos = (int) list.remove(0);
                    int ref = 0;
                    flujo.seek((pos - 1) * record.sizeOf() + headerSize);
                    flujo.readChar();
                    ref = flujo.readInt();
                    flujo.seek(0);
                    System.out.println(ref);
                    flujo.writeInt(ref);
                    flujo.seek((pos - 1) * record.sizeOf() + headerSize);
                    flujo.writeChar(record.getBorrado());
                    flujo.writeInt(record.getReferencia());
                    flujo.writeInt(record.getId());
                    flujo.writeUTF(record.getName());
                    flujo.writeUTF(record.getBirthdate());
                    flujo.writeFloat(record.getSalary());
                    break;
                }
            }
        } catch (Exception e) {

        }
        return created;
    }
//ES LA

    public boolean delete(int id) throws IOException {
        Record record = new Record();
        boolean found = false;
        int rrn = 0;
        long fp = 0;
        try {
            flujo.seek(0 + headerSize);
            while (true) {
                System.out.println(flujo.getFilePointer());
                record.setBorrado(flujo.readChar());
                record.setReferencia(flujo.readInt());
                record.setId(flujo.readInt());
                System.out.println(record.getId());
                record.setName(flujo.readUTF());
                System.out.println(record.getName());
                record.setBirthdate(flujo.readUTF());
                record.setSalary(flujo.readFloat());
                System.out.println(record.getBirthdate());
                rrn++;
                if (record.getBorrado() != '*') {
                    if (record.getId() == id) {
                        found = true;
                        record.setBorrado('*');
                        flujo.seek(0);
                        header = flujo.readInt();
                        System.out.println("ESTE ES EL HEADER:" + header);
                        if (header == -1) {
                            flujo.seek(0);
                            flujo.writeInt(rrn);
                            flujo.seek((rrn - 1) * record.sizeOf() + headerSize);
                            System.out.println("FILEPOINTER" + flujo.getFilePointer());
                            flujo.writeChar(record.getBorrado());
                            flujo.writeInt(header);
                            flujo.writeInt(record.getId());
                            flujo.writeUTF(record.getName());
                            flujo.writeUTF(record.getBirthdate());
                            flujo.writeFloat(record.getSalary());
                            list.add(0, rrn);
                            System.out.println("AQUI ENTRA");
                        } else {
                            flujo.seek(0);
                            flujo.writeInt(rrn);
                            flujo.seek((rrn - 1) * record.sizeOf() + headerSize);
                            System.out.println("FILEPOINTER" + flujo.getFilePointer());
                            flujo.writeChar(record.getBorrado());
                            flujo.writeInt(header);
                            flujo.writeInt(record.getId());
                            flujo.writeUTF(record.getName());
                            flujo.writeUTF(record.getBirthdate());
                            flujo.writeFloat(record.getSalary());
                            list.add(0, rrn);
                        }
                        return found;
                    }
                }
            }
        } catch (EOFException e) {
            return found;
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
                System.out.println(flujo.getFilePointer());
                record.setBorrado(flujo.readChar());
                record.setReferencia(flujo.readInt());
                record.setId(flujo.readInt());
                System.out.println(record.getId());
                record.setName(flujo.readUTF());
                System.out.println(record.getName());
                record.setBirthdate(flujo.readUTF());
                record.setSalary(flujo.readFloat());
                System.out.println(record.getBirthdate());
                if (record.getBorrado() != '*') {
                    model.addRow(new Object[]{record.getId(), record.getName(), record.getBirthdate(), record.getSalary()});
                }
            }
        } catch (Exception e) {
        }
        return model;
    }

}
