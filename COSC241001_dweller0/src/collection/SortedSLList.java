/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 * This is the sorted single linked list class. It has the following methods:
 * size, clear, insert, isEmpty, remove, and toString.
 *
 * @author Daniel
 * @version 11.1.12
 */
public class SortedSLList {

    private SLListNode head;
    private SLListNode tail;
    private int size;

    /*
     * This is the size method. It will return the size.
     * @return int It will return the size as an int.
     */
    public int size() {
        return size;
    }

    /*
     * This is the clear method. It will clear the entire list.
     */
    //This will make the list empty
    public void clear() {
        head = null;
        tail = null;

        size = 0;
    }

    /*
     * This is the insert method. This will insert an element into the list.
     * @param element This is an element which can be compared.
     * @return void This will return void.
     * @return void This will return void.
     * @return void This will return void.
     */
    public void insert(Comparable element) {
        SLListNode newNode = new SLListNode(element, null);
        SLListNode ref = head;
        if (head == null) {
            head = tail = newNode;
            //use this for circularly linked list because it will point back to the original node.
            //head.next=head;
            ++size;
            return;
        }
//this loop needs some work. it only checks if it before the head.
        if (((Comparable) (ref.data)).compareTo(element) >= 0) {
            newNode.next = head;
            head = newNode;
            ++size;
            return;
        }


        while (ref.next != null) {
            if (((Comparable) (ref.next.data)).compareTo(element) >= 0) {
                newNode.next = ref.next;
                ref.next = newNode;
                ++size;
                return;
            }

            ref = ref.next;
        }
        tail.next = newNode;
        tail = newNode;
        ++size;
    }

    /*
     * This is the isEmpty method. It will determine if the list is empty.
     * @return boolean This will return a boolean type.
     */
    public boolean isEmpty() {
        return head == null;
    }

    /*
     * This is the toString method. It will convert the list into a String.
     * @return out This will return the string type answer.
     */
    public String toString() {
        String out = "The SortedSLList contains = \n";
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

    /*
     * This is the remove method. It will remove an element from the list.
     * @param element This is the element it will use to compare.
     * @return boolean This will return false.
     * @return boolean This will return true.
     * @return boolean This will return true.
     * @return boolean This will return false.
     * @return boolean This will return true.
     * @return boolean This will return true.
     * @return boolean This will return false.
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
}
