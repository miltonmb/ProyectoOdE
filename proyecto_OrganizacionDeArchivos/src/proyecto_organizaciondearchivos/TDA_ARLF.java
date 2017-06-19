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
    private static int headerSize = Integer.BYTES;
    private static int sizeOf = Character.BYTES + Integer.BYTES + (Character.BYTES+40)+ (Character.BYTES+10)+Float.BYTES;
    public TDA_ARLF(File file) throws IOException {
        this.file = file;
        if (file.exists() && !file.isFile()) {
            throw new IOException(file.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(file, "rw");
        if(file.length()>0){
            header = flujo.readInt();
            list.add(header);
            while(true){ 
                flujo.seek(header*sizeOf);
                int borrados = flujo.readInt();
            }
        }
        list = new LinkedList();

    }

    public boolean insert(Record record) {
        boolean created = false;
        try {
            while (true) {
                if (list.isEmpty()) {
                    created = true;
                    flujo.seek(file.length());
                    flujo.writeChar(record.getBorrado());
                    flujo.writeInt(record.getId());
                    flujo.writeUTF(record.getName());
                    flujo.writeUTF(record.getBirthday());
                    flujo.writeFloat(record.getSalary());
                    break;
                } else {

                    created = true;
                    int pos = (int) list.remove(0);
                    flujo.seek((pos - 1)*sizeOf);
                    flujo.writeChar(record.getBorrado());
                    flujo.writeInt(record.getId());
                    flujo.writeUTF(record.getName());
                    flujo.writeUTF(record.getBirthday());
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
        try {
            flujo.seek(0);
            while (true) {
                System.out.println(flujo.getFilePointer());
                record.setBorrado(flujo.readChar());
                record.setId(flujo.readInt());
                System.out.println(record.getId());
                record.setName(flujo.readUTF());
                System.out.println(record.getName());
                record.setBirthday(flujo.readUTF());
                record.setSalary(flujo.readFloat());
                System.out.println(record.getBirthday());
                rrn++;
                if (record.getBorrado() != '*') {
                    if (record.getId() == id) {
                        found = true;
                        record.setBorrado('*');
                        flujo.seek(sizeOf * (rrn - 1));
                        flujo.writeChar(record.getBorrado());
                        flujo.writeInt(record.getId());
                        flujo.writeUTF(record.getName());
                        flujo.writeUTF(record.getBirthday());
                        flujo.writeFloat(record.getSalary());
                        list.add(0,rrn);
                        System.out.println("RRN: " +list.get(0));
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
            flujo.seek(0);
            while (true) {
                System.out.println(flujo.getFilePointer());
                record.setBorrado(flujo.readChar());
                record.setId(flujo.readInt());
                System.out.println(record.getId());
                record.setName(flujo.readUTF());
                System.out.println(record.getName());
                record.setBirthday(flujo.readUTF());
                record.setSalary(flujo.readFloat());
                System.out.println(record.getBirthday());
                if (record.getBorrado() != '*') {
                    model.addRow(new Object[]{record.getId(), record.getName(), record.getBirthday(), record.getSalary()});
                }
            }
        } catch (Exception e) {
        }
        return model;
    }

}
