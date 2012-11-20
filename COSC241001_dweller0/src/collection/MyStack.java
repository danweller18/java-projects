/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

/**
 * This is the My Stack class. It has the following methods: pop, push, top, and
 * toString.
 *
 * @author Daniel
 * @version 11.8.12
 */
public class MyStack {

    private SLListNode top;

    /**
     * This is the pop method. This will remove an object from the stack.
     *
     * @return Object This will return the list without the element.
     */
    public Object pop() {
        if (top == null) {
            return null;
        }
        Object temp = top.data;
        top = top.next;
        //System.out.println("Popping "+temp);
        return temp;
    }

    /**
     * This is the push method. This will add an object into the stack.
     *
     * @param element This is the element which can be compared.
     * @return void This will return void.
     */
    public void push(Object element) {
        //System.out.println("Pushing "+element);
        if (top == null) {
            top = new SLListNode(element, null);
        } else {
            top = new SLListNode(element, top);
        }
    }

    /**
     * This is the top method. This will check to see if the top is empty.
     *
     * @return Comparable This will return a comparable object.
     */
    public Object top() {
        if (top == null) {
            return null;
        }
        return top.data;
    }

    /**
     * This is the toString method. This will convert the list into a string.
     *
     * @return String This will return the list in a string.
     */
    public String toString() {
        String out = "The Stack contains = \n";
        SLListNode ref = top;

        if (top == null) {
            return out + "0 numbers.";
        } else {
            out += "top -> \t";
        }

        while (ref.next != null) {
            out += ref.data + "\t -> \t";
            ref = ref.next;
        }

        out += ref.data + "\t -> null";
        return out;
    }

    /**
     * This is the clear method. This will clear the stack.
     */
    public void clear() {
        top = null;
    }

    /*
     * This is the isEmpty method. It will determine if the stack is empty.
     * @return boolean This will return a boolean type.
     */
    public boolean isEmpty() {
        return top == null;
    }
//
//    public int topPriority() {
//        if ((((Character) (top.data) == '*')) || (((Character) (top.data) == '/'))
//                || (((Character) (top.data) == '%'))) {
//            return 2;
//        }
//        if ((((Character) (top.data) == '+')) || (((Character) (top.data) == '-'))) {
//            return 1;
//        }
//        return 0;
//    }
//
//    public int priority(char ch) {
//        if (ch == '/' || ch == '*' || ch == '%') {
//            return 2;
//        }
//        if (ch == '+' || ch == '-') {
//            return 1;
//        }
//        return 0;
//    }
    
    /**
     * This is the toNewString method. This will convert the queue into a string.
     *
     * @return String This will return the list in a string.
     */
    public String toNewString() {
        String out = "";
        SLListNode ref = top;

        if (top == null) {
            return out + "0 numbers.";
        }

        while (ref != null) {
            out += ref.data;
            ref = ref.next;
        }
        return out;
    }
    
}
