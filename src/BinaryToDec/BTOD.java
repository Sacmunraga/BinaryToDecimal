package BinaryToDec;

import java.util.Scanner;
import java.math.*;

/**
 * Binary to Decimal converter
 * @author Tim Shumeyko (sacmunraga)
 */
public class BTOD {
   public static void main(String[] args) {
      String  number;                           // Holds user input
      int decimalNum = 0;                       // the final decimal number
      Scanner scnr = new Scanner(System.in);    // used to get input from user

      System.out.print("Enter your binary number ");
      number = scnr.next();

      // process the number
      for (int i = 0; i < number.length(); i++){
         // make sure we're only dealing with ones and zero's
         if (number.charAt(i) == '1' || number.charAt(i) == '0'){
            // Convert current char at index to an integer, and multiply by the power of it (2^i)
            decimalNum += (Character.getNumericValue(number.charAt(i)) * Math.pow(2, number.length()-1-i));
         } else {
            decimalNum = 0;
            System.out.println("Only 1's and 0's allowed!");
            break;
         }
      }

      System.out.println(decimalNum);
   }
}
