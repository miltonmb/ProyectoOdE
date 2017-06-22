package proyecto_organizaciondearchivos;

public class ArbolB {

    private Node root;

    public ArbolB() {
        root = new Node();
        root.isLeaf = true;
        root.numberOfNodes = 0;
        root.key[0] = new indice(-1, 0);
    }

    public void insert(indice k) {
        Node r = root;
        if (r.numberOfNodes == 3) {
            Node s = new Node();
            root = s;
            s.numberOfNodes = 0;
            s.isLeaf = false;
            s.children[0] = r;
            split(s, 1, r);
            insert(s, k);
        } else {
            insert(r, k);
        }
    }

    private void insert(Node node, indice value) {
        int i = node.numberOfNodes;
        if (node.isLeaf) {
            while (i >= 1 && value.getId() < node.key[i - 1].getId()) {
                node.key[i] = node.key[i - 1];
                i--;
            }
            node.key[i] = value;
            node.numberOfNodes++;
        } else {
            while (i >= 1 && value.getId() < node.key[i - 1].getId()) {
                i--;
            }
            i++;
            if (node.children[i - 1].numberOfNodes == 3) {
                split(node, i, node.children[i - 1]);
                if (value.getId() > node.key[i - 1].getId()) {
                    i++;
                }
            }
            insert(node.children[i - 1], value);
        }
    }

    private void split(Node parentNode, int childIndex, Node newChild) {
        Node z = new Node();
        z.isLeaf = newChild.isLeaf;
        z.numberOfNodes = 1;
        z.key[0] = newChild.key[2];
        if (!newChild.isLeaf) {
            z.children[1] = newChild.children[3];
            z.children[0] = newChild.children[2];
        }
        newChild.numberOfNodes = 1;
        for (int j = parentNode.numberOfNodes + 1; j >= childIndex + 1; j--) {
            parentNode.children[j] = parentNode.children[j - 1];
            parentNode.key[j - 1] = parentNode.key[j - 2];
        }
        parentNode.children[childIndex] = z;
        parentNode.key[childIndex - 1] = newChild.key[1];
        parentNode.numberOfNodes++;
    }

    public void print() {
        printBtree(root, "");

    }

    private void printBtree(Node node, String indent) {
        if (node == null) {
            System.out.println(indent + "The B-Tree is Empty");
        } else {
            System.out.println(indent + " ");
            String childIndent = indent + "\t";
            for (int i = node.numberOfNodes - 1; i >= 0; i--) {
                if (!node.isLeaf) {
                    printBtree(node.children[i], childIndent);
                }
                if (node.key[i].getId() > 0) {
                    System.out.println(childIndent + node.key[i].getId());
                }
            }
            if (!node.isLeaf) {
                printBtree(node.children[node.numberOfNodes], childIndent);
            }
        }
    }

    public boolean search(int k) {
        Node x = root;
        return search(x, k);
    }

    private boolean search(Node node, int value) {
        int i = 1;
        while (i <= node.numberOfNodes && value > node.key[i - 1].getId()) {
            i++;
        }
        if (i <= node.numberOfNodes && value == node.key[i - 1].getId()) {
            return true;
        }
        if (!node.isLeaf) {
            return search(node.children[i - 1], value);
        }
        return false;
    }
}
