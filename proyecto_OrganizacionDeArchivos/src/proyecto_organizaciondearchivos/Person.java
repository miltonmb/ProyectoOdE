/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_organizaciondearchivos;

import java.util.Arrays;

/**
 *
 * @author milton
 */
public class Person {
    private final int Id;
    private char[] name =new char[40];
    private char[] birthdate = new char[40];
    private final float Salary;
    private final int weigth; 

    public Person(int Id, char[] name, char[] birthdate, float Salary, int weigth) {
        this.Id = Id;
        this.name = name;
        this.birthdate = birthdate;
        this.Salary = Salary;
        this.weigth = weigth;
    }

    public char[] getName() {
        return name;
    }

    public void setName(char[] name) {
        this.name = name;
    }

    public char[] getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(char[] birthdate) {
        this.birthdate = birthdate;
    }

    @Override
    public String toString() {
        return "Person{" + "Id=" + Id + ", name=" + Arrays.toString(name) + ", birthdate=" + Arrays.toString(birthdate) + ", Salary=" + Salary + ", weigth=" + weigth + '}';
    }
   
    
}
