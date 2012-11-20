/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 * This is the Double linked list class. It has the following methods: append,
 * insert, toString, remove, and clear.
 *
 * @author Daniel
 * @version 11.13.12
 */
public class DLList {

    public DLListNode head;
    public DLListNode tail;

    /**
     * This is the DLList method.
     */
    public DLList() {
        head = tail = null;
    }

    /*
     * This is the append method. It will assign an element into the list.
     * @param element This is the element which will be added into the list.
     * @return void This will return void.
     */
    public void append(Object element) {
        if (head == null) {
            head = tail = new DLListNode(element, null, null);
            return;
        }
        tail.next = new DLListNode(element, tail, null);
        tail = tail.next;
    }

    /*
     * This is the insert method. It will insert an element into the list.
     * @param element This is the element which will be inserted into the list.
     * @return void This will return void.
     */
    public void insert(Object element) {
        if (head == null) {
            head = tail = new DLListNode(element, null, null);
            return;
        }
        head.prev = new DLListNode(element, null, head);
        head = head.prev;
    }

    /*
     * This is the toString method. It will convert the list into a string.
     * @return String This will return the string type answer.
     */
    public String toString() {
        String out = "The DLList contains: \n";
        if (head == null) {
            return out + "0 nodes \n";
        }
        out += "head --> \t";
        DLListNode ref = head;
        while (ref != tail) {
            out += ref.data + "\t <--> \t";
            ref = ref.next;
        }
        out += ref.data + "\t <-- tail\n";
        return out;
    }

    /*
     * This is the remove method. It will remove an element from the list.
     * @param element This is the element which will be removed.
     * @return void This will remove the object and return void.
     */
    public void remove(Object element) {
        if (head == null) {
            return;
        }
        if (((Comparable) element).compareTo(head.data) == 0) {
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
                head.prev = null;
            }
            return;
        }

        if (head == tail) {
            return;
        }

        DLListNode ref = head.next;
        while (ref != tail) {
            if (((Comparable) ref.data).compareTo(element) == 0) {
                ref.prev.next = ref.next;
                ref.next.prev = ref.prev;
                return;
            }
            ref = ref.next;
        }

        if (((Comparable) ref.data).compareTo(tail.data) == 0) {
            ref.prev.next = null;
            tail = tail.prev;
        }
    }

    /**
     * This is the clear method. This will clear the list.
     */
    public void clear() {
        head = tail = null;
    }
}
