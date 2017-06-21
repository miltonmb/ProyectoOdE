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
class indice {
    private int Id;
    private int rrn;

    public indice(int Id, int rrn) {
        this.Id = Id;
        this.rrn = rrn;
    }
    
    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getRrn() {
        return rrn;
    }

    public void setRrn(int rrn) {
        this.rrn = rrn;
    }
    
    
}
