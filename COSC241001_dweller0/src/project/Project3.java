/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.*;
import collection.MyQueue;
import collection.MyStack;

/**
 * This is the infix to postfix evaluator. It will read in the infix from a file 
 * line by line, and then convert the expression into postfix. Next it will 
 * evaluate the postfix expression and write these into a file.
 * @author Daniel
 * @version 11.20.12
 */
public class Project3 {

    public static void test() {

        //this will read the file line by line
        MyStack stack = new MyStack();
        MyQueue queue = new MyQueue();

        //try catch clause
        try {
            //reads in the file and writes to the file.
            BufferedReader reader = new BufferedReader(new FileReader("../Project3Input.txt"));
            String line = reader.readLine();
            FileWriter writer = new FileWriter("../Project3Output_dweller0.txt ");

            while (line != null) {
                stack.clear();
                queue.clear();

                //the boolean value for isValid.
                boolean isValid = true;

                //trim the line - if it is a blank line then read the next line.
                line = line.trim();
                if (line.length() == 0) {
                    line = reader.readLine();
                    continue;
                }

                int nums = 0, ops = 0;
                for (int i = 0; i < line.length(); i++) {
                    if (Character.isDigit(line.charAt(i))) {
                        nums++;
                    } else if ("+-*/%".contains("" + line.charAt(i))) {
                        ops++;
                    }
                }
                if (nums != ops + 1) {
                    isValid = false;
                    System.out.println("fail");
                }

                //'g' is a character
                //"j" is a string

                //for loop to check the characters at each line.
                for (int i = 0; i < line.length() && isValid; i++) {
                    char c = line.charAt(i);
                    if (c == ' ') {
                        continue;
                    }
                    //error case checking to see if its not 0-9 or a special character
                    //then return error (within the for loop).
                    if (!"0123456789+-*/%()".contains(c + "")) {
                        isValid = false;
                    }

                    if (!isValid) {
                        writer.write("Original Infix: " + line + "\r\n");
                        writer.write("**Invalid expression**" + "\r\n\r\n\r\n");
                        continue;
                    } 
                    //if its a digit put it into queue. other wise put into stack
                    else if (Character.isDigit(c)) {
                        queue.insertBack(c);
                    } //the one for (
                    else if (c == '(') {
                        stack.push(c);
                    } //the one for )
                    else if (c == ')') {
                        while (((Character) (stack.top()) != '(')) {
                            queue.insertBack(stack.pop());
                        }
                        stack.pop();
                    } //the one for  * / and %
                    else if (c == '*' || c == '/' || c == '%') {
                        stack.push(c);
                    } //the one for + and -
                    else if (c == '+' || c == '-') {
                        while (!stack.isEmpty() && ((Character) (stack.top())) != '(') {
                            queue.insertBack(stack.pop());
                        }
                        stack.push(c);
                    }

                }//end of for loop - for line.length()
                
                //if there is anything left in stack or the top of the stack is 
                //not (, then add it into the queue.
                while (!stack.isEmpty() && ((Character) (stack.top())) != '(') {
                    queue.insertBack(stack.pop());
                }

                //DONE BUILDING POSTFIX

                //this will return invalid expression if stack contains characters.
                if (!stack.isEmpty()) {
                    isValid = false;
                }
                if (!isValid) {
                    writer.write("Original Infix: " + line + "\r\n");
                    writer.write("**Invalid expression**" + "\r\n\r\n\r\n");
                    line = reader.readLine();
                    continue;
                }

                writer.write("Original Infix: " + line + "\r\n");
                writer.write("Corresponding Postfix: " + queue.toNewString() + "\r\n");

                //evaluation of queue.
                while (!queue.isEmpty()) {
                    Character to = (Character) (queue.removeFront());
                    if (Character.isDigit(to)) {
                        stack.push(to);
                    } else if (to.equals('*')) {
                        int tempR = Integer.parseInt(stack.pop() + "");
                        int tempL = Integer.parseInt(stack.pop() + "");
                        stack.push(((Integer) tempL) * ((Integer) tempR));
                    } else if (to.equals('/')) {
                        int tempR = Integer.parseInt(stack.pop() + "");
                        int tempL = Integer.parseInt(stack.pop() + "");
                        stack.push(((Integer) tempL) / ((Integer) tempR));
                    } else if (to.equals('%')) {
                        int tempR = Integer.parseInt(stack.pop() + "");
                        int tempL = Integer.parseInt(stack.pop() + "");
                        stack.push(((Integer) tempL) % ((Integer) tempR));
                    } else if (to.equals('+')) {
                        int tempR = Integer.parseInt(stack.pop() + "");
                        int tempL = Integer.parseInt(stack.pop() + "");
                        stack.push(((Integer) tempL) + ((Integer) tempR));
                    } else if (to.equals('-')) {
                        int tempR = Integer.parseInt(stack.pop() + "");
                        int tempL = Integer.parseInt(stack.pop() + "");
                        stack.push(((Integer) tempL) - ((Integer) tempR));
                    }
                }

                writer.write("Evaluation Result: " + stack.toNewString() + "\r\n\r\n\r\n");

                line = reader.readLine();

            }//end of the while loop.

            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            //the specified file could not be found
        } catch (IOException e) {
            //something went wrong with reading or closing.
        }
    }//end of test method.
}//end of project class
