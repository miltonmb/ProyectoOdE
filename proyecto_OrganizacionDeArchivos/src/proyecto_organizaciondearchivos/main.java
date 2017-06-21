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
public class main {
    public static void main(String[] args) {
        ArbolB x = new ArbolB();
        for (int i = 1; i <= 10000; i++) {
            x.insert(new indice(i,i));
        }
        x.print();

    }
}
