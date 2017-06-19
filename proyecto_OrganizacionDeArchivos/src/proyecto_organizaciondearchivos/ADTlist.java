package proyecto_organizaciondearchivos;

import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author milton
 */
public abstract class ADTlist implements Serializable {

    private static final long serialVersionUID = 7526472295622776147L;
    protected int size;

    public ADTlist() {
        size = 0;
    }

    public int getSize() {
        return size;
    }

}
