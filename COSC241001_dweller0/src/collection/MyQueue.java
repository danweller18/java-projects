/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 * This is the My Queue class. It has the following methods: insert back, remove
 * front, front, toString.
 *
 * @author Daniel
 * @version 11.8.12
 */
public class MyQueue {

    private SLListNode front;
    private SLListNode rear;

    /**
     * This is the MyQueue method.
     */
    public MyQueue() {
        front = rear = null;
    }

    /**
     * This is the insert back method. It will insert elements at the back of
     * the list.
     *
     * @param element This is the element which can be compared.
     * @return void This will return void.
     */
    public void insertBack(Object element) {
        if (front == null) {
            front = rear = new SLListNode(element, null);
            return;
        }
        rear = rear.next = new SLListNode(element, null);
    }

    /**
     * This is the remove front method. It will remove elements from the front
     * of the list.
     *
     * @return Object This will return the list with the element out of the
     * list.
     */
    public Object removeFront() {
        if (front == null) {

            return null;
        }

        Object temp = front.data;
        if (front == rear) {

            front = rear = null;
            return temp;
        }
        front = front.next;
        return temp;
    }

    /**
     * This is the front method. It will check to see if there is an element in
     * the front of the list.
     *
     * @return Object This will return the object if there is an element in the
     * front.
     */
    public Object front() {
        if (front == null) {
            return null;
        }
        return front.data;
    }

    /**
     * This is the toString method. This will convert the queue into a string.
     *
     * @return String This will return the list in a string.
     */
    public String toString() {
        String out = "The Queue contains = \n";
        SLListNode ref = front;

        if (front == null) {
            return out + "0 numbers.";
        } else {
            out += "front <-> \t";
        }

        while (ref.next != null) {
            out += ref.data + "\t <-> \t";
            ref = ref.next;
        }

        out += ref.data + "\t <-> null";
        return out;
    }

    /**
     * This is the toNewString method. This will convert the queue into a string.
     *
     * @return String This will return the list in a string.
     */
    public String toNewString() {
        String out = "";
        SLListNode ref = front;

        if (front == null) {
            return out + "0 numbers.";
        }

        while (ref != null) {
            out += ref.data;
            ref = ref.next;
        }
        return out;
    }

    /**
     * This is the clear method. This will clear the queue.
     */
    public void clear() {
        front = rear = null;
    }
    
    /*
     * This is the isEmpty method. It will determine if the stack is empty.
     * @return boolean This will return a boolean type.
     */
    public boolean isEmpty() {
        return front == null;
    }
    
}
