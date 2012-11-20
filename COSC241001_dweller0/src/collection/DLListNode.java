/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 * This is the double linked list node class. It will declare the list node.
 *
 * @author Daniel
 * @version 11.13.12
 */
public class DLListNode {

    public Object data;
    public DLListNode next;
    public DLListNode prev;

    /*
     * This is the single linked list node method. 
     * @param d This is element d.
     * @param p This is the DLListNode p.
     * @param n This is DLListNode n.
     */
    public DLListNode(Object d, DLListNode p, DLListNode n) {
        data = d;
        prev = p;
        next = n;
    }
}
