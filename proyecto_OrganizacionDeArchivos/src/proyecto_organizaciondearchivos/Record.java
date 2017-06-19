/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_organizaciondearchivos;

/**
 *
 * @author milton
 */
public class Record {
    private int id;
    private String name;
    private String birthday;
    private float Salary;
    private char borrado;
    private int RRN_apuntador;
    public Record(int id, String name, String birthday,float Salary) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.Salary = Salary;
        this.borrado = '-';
    }

    Record() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public float getSalary() {
        return Salary;
    }

    public void setSalary(float Salary) {
        this.Salary = Salary;
    }
    

    public char getBorrado() {
        return borrado;
    }

    public void setBorrado(char borrado) {
        this.borrado = borrado;
    }

    public int getRRN_apuntador() {
        return RRN_apuntador;
    }

    public void setRRN_apuntador(int RRN_apuntador) {
        this.RRN_apuntador = RRN_apuntador;
    }
    
    

    
    public int sizeOf(){
        int size = Character.BYTES + Integer.BYTES + (Character.BYTES+this.getName().length())+ (Character.BYTES+this.getBirthday().length())+Float.BYTES;
        return size;
    }
    

    @Override
    public String toString() {
        return "Record{" + "id=" + id + ", name=" + name + ", birthday=" + birthday + '}';
    }

    
}
