/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab;

import java.util.*;

/**
 *
 * @author Daniel
 * @version 2012.10.17
 */
public class Lab4 {
    
    
    /**
     * 
     */
    public static void test() {

        //ask user to input a string
        System.out.println("Please enter a string with no spaces: ");

        Scanner sc = new Scanner(System.in);
        String string1 = sc.nextLine();

        //exit the program if a blank space is returned
        if(string1.length() == 0){
            System.out.println("End of Program");
        System.exit(0);
        }
        
        //it cannot contain any whitespaces
        if (string1.contains(" ")) {
            System.out.println("Error. Please Start Over.");
        }
        //check to see if it is a palindrome
        if (isPalindrome(string1)) {
            System.out.println(string1 + " is a palindrome");
        } else {
            System.out.println(string1 + " is not a palindrome");
        }
    }

    //the isPalindrome method
    
    /**
     * 
     * @param s is the name of the string.
     * @return will return true if the length is = to 0 or 1.
     * @return will check the rest of the word
     * @return will return false if the conditions are not met
     */
    public static boolean isPalindrome(String s) {
        //if method checking to see if length is = to 0 or 1
        if (s.length() == 0 || s.length() == 1) {
            return true;
        }
        
        //if the first character is the same as the last character
        if (s.charAt(0) == s.charAt(s.length() - 1)) {
            return isPalindrome(s.substring(1, s.length() - 1));
        }
        return false;
    }
}
