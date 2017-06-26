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
public class ArbolB implements Serializable {

    private static final long SerialVersionUID = 666L;
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
        Node node = new Node();
        node.isLeaf = newChild.isLeaf;
        node.numberOfNodes = 1;
        node.key[0] = newChild.key[2];
        if (!newChild.isLeaf) {
            node.children[1] = newChild.children[3];
            node.children[0] = newChild.children[2];
        }
        newChild.numberOfNodes = 1;
        for (int j = parentNode.numberOfNodes + 1; j >= childIndex + 1; j--) {
            parentNode.children[j] = parentNode.children[j - 1];
            parentNode.key[j - 1] = parentNode.key[j - 2];
        }
        parentNode.children[childIndex] = node;
        parentNode.key[childIndex - 1] = newChild.key[1];
        parentNode.numberOfNodes++;
    }

    public indice search(int k) {
        Node x = root;
        return search(x, k);
    }

    private indice search(Node node, int value) {
        int i = 1;
        while (i <= node.numberOfNodes && value > node.key[i - 1].getId()) {
            i++;
        }
        if (i <= node.numberOfNodes && value == node.key[i - 1].getId()) {
            return node.key[i - 1];
        }
        if (!node.isLeaf) {
            return search(node.children[i - 1], value);
        }
        return null;
    }

    public boolean delete(int k) {
        Node x = root;
        return delete(x, k);
    }

    public boolean delete(Node node, int value) {
        int i = 1;
        while (i <= node.numberOfNodes && value > node.key[i - 1].getId()) {
            i++;
        }
        if (node.isLeaf) {
            if (i <= node.numberOfNodes && value == node.key[i - 1].getId()) {
                node.key[i-1].setId(0);
                node.key[i-1].setRrn(0);
                for (int j = i - 1; j < node.numberOfNodes - 1; j++) {
                    node.key[j] = node.key[j + 1];
                    if (j + 1 == node.numberOfNodes - 1) {
                        node.numberOfNodes--;
                    }
                }
                return true;
            }
        } else {
            return delete(node.children[i - 1], value);
        }
        return false;
    }
}
