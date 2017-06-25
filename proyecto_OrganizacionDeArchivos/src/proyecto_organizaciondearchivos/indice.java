
package proyecto_organizaciondearchivos;
import java.io.Serializable;


class indice implements Serializable {
    private static final long SerialVersionUID = 666L;
    private int Id;
    private int rrn;

    public indice(int Id, int rrn) {
        this.Id = Id;
        this.rrn = rrn;
    }

    indice() {
        
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

    @Override
    public String toString() {
        return "indice{" + "Id=" + Id + ", rrn=" + rrn + '}';
    }

    
}
