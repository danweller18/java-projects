/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 * This is the single link list node class. It will declare the list node.
 *
 * @author Daniel
 * @version 11.1.12
 */
public class SLListNode {

    public Object data;
    public SLListNode next;

    /*
     * This is the single linked list node method. 
     * @param d This is element d.
     * @param n This is element n.
     */
    public SLListNode(Object d, SLListNode n) {
        data = d;
        next = n;
    }
}
