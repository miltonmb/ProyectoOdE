/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_organizaciondearchivos;

import java.io.Serializable;

/**
 *
 * @author milton
 */
public class AvailList extends ADTlist implements Serializable {
    
    protected class Nodo implements Serializable {
        protected Object elemento;
        protected Nodo siguiente;

        public Nodo(Object elemento) {
            this.elemento = elemento;
        }
        public void setElement(Object element){
            elemento = element;
        }
    }

    protected Nodo head;

    public AvailList() {
       size = 0;
    }

    public boolean Insert(Object e, int pos) {
        if (pos < 0 || pos > size) {
            return false;
        }
        Nodo neo = new Nodo(e);
        /*En el caso de que la cabeza este vacia*/
        if (head == null) {
            head = neo;
            /*En el caso de que la cabeza ya tenga un objeto
	y se quiera insertar en la posicion 0*/
        } else if (pos == 0) {
            neo.siguiente = head;
            head = neo;
            /*Insertar en cualquier lado*/
        } else {
            Nodo temp = head;
            for (int i = 1; i < pos; ++i) {
                temp = temp.siguiente;

            }
            neo.siguiente = temp.siguiente;
            temp.siguiente = neo;
        }
        size++;
        return true;
    }

    public Object remove(int pos) {
        if (pos < 0 || pos >= size) {
            return null;
        }
        Nodo temporal;
        /*En el caso de borrar el primer elemento de la lista*/
        if (pos == 0) {
            temporal = head;
            head = temporal.siguiente;
            Object retVal = temporal.elemento;
            //temporal ->elemento = 0;      
            temporal = null;
            size--;
            return retVal;
            /*En el caso de borrar el ultimo elemento*/
        } else if (pos == size - 1) {
            temporal = head;
            for (int i = 1; i < pos; i++) {
                temporal = temporal.siguiente;
            }
            Object retValDos = temporal.siguiente.elemento;
            temporal.siguiente.elemento = null;
            temporal.siguiente = null;
            size--;
            return retValDos;
            /*Borrar de cualquier lado de la lista*/
        } else {
            temporal = head;
            for (int i = 1; i < pos; i++) {
                temporal = temporal.siguiente;
            }
            Nodo guardar = temporal.siguiente.siguiente;
            Object retValTres = temporal.siguiente.elemento;
            temporal.siguiente.elemento = null;
            temporal.siguiente = null;
            temporal.siguiente = guardar;
            size--;
            return retValTres;
        }
    }

    public Object first() {
        if (head != null) {
            return head.elemento;
        }
        return null;
    }

    public Object last() {
        if (head == null) {
            return null;
        }
        Nodo temp = head;
        for (int i = 0; i < size; ++i) {
            temp = temp.siguiente;
        }
        return temp.elemento;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int indexOf(Object e) {
        Nodo temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.elemento.equals(e)) {
                return i;
            }
            temp = temp.siguiente;
        }
        return -1;
    }

    public Object get(int pos) {
        if (pos < 0 || pos >= size) {
            return null;
        }
        Nodo temp = head;
        for (int i = 0; i < pos; i++) {
            temp = temp.siguiente;
        }
        return temp.elemento;
    }
  public void add(Object ob, int pos) {
        if (pos < 0 || pos >= size) {

        }
        Nodo temp = head;
        for (int i = 0; i < pos; i++) {
            if (i == pos - 1) {
                temp.siguiente.setElement(ob);
            } else {
                temp = temp.siguiente;
            }

        }

    }

    public boolean isEmpty() {
        return size == 0;
    }
}
