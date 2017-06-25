package proyecto_organizaciondearchivos;

import java.io.Serializable;

public class Node implements Serializable {

    private static final long SerialVersionUID = 666L;
    public int numberOfNodes;

    public indice key[];

    public Node children[];

    public boolean isLeaf;

    Node() {
        key = new indice[3];
        children = new Node[4];
        isLeaf = true;
    }
}
