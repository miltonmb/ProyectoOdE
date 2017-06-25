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
    private String birthdate;
    private float Salary;
    private char borrado;
    private int referencia;

    public Record(int id, String name, String birthdate, float Salary) {
        this.id = id;
        this.name = name;
        this.birthdate = birthdate;
        this.Salary = Salary;
        this.borrado = '-';
        this.referencia = 0;

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
        for (int i = name.length(); i < 40; i++) {
            name += " ";
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
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

    public int getReferencia() {
        return referencia;
    }

    public void setReferencia(int referencia) {
        this.referencia = referencia;
    }

    public int sizeOf() {
        int size = 68;
        return size;
    }

    @Override
    public String toString() {
        return "Record{" + "id=" + id + ", name=" + name + ", birthday=" + birthdate + '}';
    }

}
