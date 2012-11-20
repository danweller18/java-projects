/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 * This is the My Deque class. It has the following methods: front, insert back,
 * remove back, insert front, remove front, and toString.
 *
 * @author Daniel
 * @version 11.13.12
 */
public class MyDeque extends DLList {

    /**
     * This is the MyDeque method.
     */
    public MyDeque() {
        super();
    }

    /**
     * This is the front method. It will check to see if there is an element at
     * the front of the list.
     *
     * @return Object This will return the object at the end of the list.
     */
    public Object front() {
        if (head == null) {
            return null;
        }
        return tail.data;
    }

    /**
     * This is the insert back method. It will append the element into the back
     * of the list.
     *
     * @param element This is the element it will insert.
     */
    public void insertBack(Object element) {
        append(element);
    }

    /**
     * This is the remove back method. It will remove the element at the end of
     * the list.
     *
     * @return Object This will return the new object at the back of the list.
     */
    public Object removeBack() {
        if (head == null) {
            return null;
        }
        Object temp = tail.data;
        if (head == tail) {
            head = tail = null;
            return temp;
        }
        tail = tail.prev;
        tail.next = null;
        return temp;
    }

    /**
     * This is the insert front method. It will insert the element into the
     * front of the list.
     *
     * @param element This is the element which will be in the front of the
     * list.
     */
    public void insertFront(Object element) {
        insert(element);
    }

    /**
     * This is the remove front method. This will remove the element from the
     * front of the list.
     *
     * @return Object This will return the new object at the front of the list.
     */
    public Object removeFront() {
        if (head == null) {
            return null;
        }
        Object temp = head.data;
        if (head == tail) {
            head = tail = null;
            return temp;
        }
        head = head.next;
        head.prev = null;
        return temp;
    }

//public String toString(){
//	String out = "The deque contains: \n";
//	DLListNode ref = head;
//need to finish and override toString method in DLList class
//}
    /**
     * This is the toString method. It will convert the list into a string.
     *
     * @return String This will return the list as a string.
     */
    public String toString() {
        String out = "The Deque contains: \n";
        if (head == null) {
            return out + "0 nodes \n";
        }
        out += "front --> \t";
        DLListNode ref = head;
        while (ref != tail) {
            out += ref.data + "\t <--> \t";
            ref = ref.next;
        }
        out += ref.data + "\t <-- back\n";
        return out;
    }
}
