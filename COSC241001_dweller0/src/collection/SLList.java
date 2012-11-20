/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 * This is the single linked list class. It has the following methods: append,
 * insert, remove, and toString.
 *
 * @author Daniel
 * @version 11.1.12
 */
public class SLList {

    private SLListNode head;
    private SLListNode tail;

    /*
     * This is the SLList method.
     */
    public SLList() {
        head = tail = null;
    }

    /*
     * This is the append method. It will assign an element into the list.
     * @param element This is the element which can be compared.
     * @return void This will return void.
     */
    public void append(Comparable element) {
        if (head == null) {
            head = tail = new SLListNode(element, null);
            return;
        }

        tail = tail.next = new SLListNode(element, null);
    }

    /*
     * This is the insert method. It will insert an element into the list.
     * @param element This is the element which can be compared.
     * @return void This will return void.
     * @return void This will return void.
     */
    public void insert(Comparable element) {
        if (head == null) {
            head = tail = new SLListNode(element, null);
            //use this for circularly linked list because it will point back to the original node.
            //head.next=head;
            return;
        }
        head = new SLListNode(element, head);
        return;
    }

    //use this as an example.
    /*
     * This is the remove method. It will remove an element from the list.
     * @param element This is the element it will use to compare.
     * @return true This will remove the object if it is returned true.
     */
    public boolean remove(Object element) {
        if (head == null) { //where the list is empty
            return false;
        }
        if (((Comparable) (head.data)).compareTo(element) == 0) { //if the head is the correct item
            if (head == tail) { //if the head is the last if there is only one item
                head = tail = null;
                return true;
            }
            head = head.next;
            return true;
        }
        if (head == tail) { //if its not the head and its the only item, then its not there
            return false;
        }
        SLListNode ref = head;
        while (ref.next != tail) { //this loop will check each item except the last
            if (((Comparable) (ref.next.data)).compareTo(element) == 0) {
                ref.next = ref.next.next;
                return true;
            }
            ref = ref.next;
        }
        if (((Comparable) (tail.data)).compareTo(element) == 0) { //this will check if its the tail and return
            tail = ref;
            tail.next = null;
            return true;
        }
        return false;
    }

    /*
     * This is the toString method. It will convert the list into a string.
     * @return out This will return the string type answer.
     */
    public String toString() {
        String out = "The SLList contains = \n";
        SLListNode ref = head;

        if (head == null) {
            return out + "0 nodes.";
        } else {
            out += "head -> \t";
        }

        while (ref.next != null) {
            out += ref.data + "\t -> \t";
            ref = ref.next;
        }

        out += ref.data + "\t -> null";
        return out;
    }

    /**
     * This is the clear method. This will clear the list.
     */
    public void clear() {
        head = tail = null;
    }
}
