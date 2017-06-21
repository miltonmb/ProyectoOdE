/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_organizaciondearchivos;

public class Node {


    public int numberOfNodes;              // number of nodes

    public indice key[];                      // the array that holds the keys value.

    public Node children[];                // the array that holds the references of the keys in the node.

    public boolean isLeaf;                   // the variable to deterime if the node is is Leaf or not.
    Node() {
        key = new indice[3];             // The node can have at most 3 keys
        children = new Node[4];       // We have 4 references for each node
        isLeaf = true;                  // assign the node to be Leaf.
    }
}
