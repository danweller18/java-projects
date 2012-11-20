/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project;

import java.io.*;
import java.util.*;
import java.util.regex.*;

/**
 *
 * @author Daniel
 */
public class Project2 {
  /**
   * The validate method makes certain that the phone number is the
   * appropriate length.
   * @param phoneNumber The seven digit phone number to convert into characters.
   * @return the 7 digit phone number
   * @throws IllegalArgumentException if phone number is not valid.
   */
  public static String validate(String phoneNumber) throws IllegalArgumentException {
    phoneNumber = phoneNumber.replace("-","");
    if (phoneNumber.length() != 7 || phoneNumber.contains("0") || phoneNumber.contains("1"))
      throw new IllegalArgumentException("Rerun the program with a valid 7 digit. "
              + "Please don't include 0 or 1 in the number");

    char[] charArray = phoneNumber.toCharArray();
    for (int i = 0; i < charArray.length; i++){
      char digit = charArray[i];
      if (!Character.isDigit(digit))
        throw new IllegalArgumentException("Please restart the program with a valid 7 DIGIT phone number.");
    }
    return phoneNumber;
  }
  public static HashMap<String,char[]> getNumberPad() {
    char[] abc = {'a','b','c'};
    char[] def = {'d','e','f'};
    char[] ghi  = {'g','h','i'};
    char[] jkl  = {'j','k','l'};
    char[] mno  = {'m','n','o'};
    char[] pqrs  = {'p','q','r','s'};
    char[] tuv  = {'t','u','v'};
    char[] wxyz  = {'w','x','y','z'};

    HashMap<String,char[]> numberPad = new HashMap<String,char[]>();
    numberPad.put("2", abc);
    numberPad.put("3", def);
    numberPad.put("4", ghi);
    numberPad.put("5", jkl);
    numberPad.put("6", mno);
    numberPad.put("7", pqrs);
    numberPad.put("8", tuv);
    numberPad.put("9", wxyz);

    return numberPad;
  }

  /**
   * The test asks the user to type a 7-digit phone number from the keyboard.
   * @param phoneNumber The seven digit phone number to convert into characters.
   */
  public static void test(String phoneNumber) {
    phoneNumber = validate(phoneNumber);
    char[] numArr = phoneNumber.toCharArray();
    HashMap<String,char[]> g = getNumberPad();
    BufferedReader br = null;
    String regex = "(" + numArr[0] + "|" + "){7}"; 
    Pattern p = Pattern.compile(regex);
    try {
      String sCurrentLine;

      br = new BufferedReader(new FileReader("../EnglishWordList.txt"));

      while ((sCurrentLine = br.readLine()) != null) {
        Matcher m = p.matcher(sCurrentLine);
      }
    }
    catch (IOException e) {
      e.getMessage();
    }
    finally {
      try {
        if (br != null)
          br.close();
      }
      catch (IOException e) {
        System.err.println(e.getMessage());
      }
    }
  }

}



