package DecimalToBinary;

import java.math.*;
import java.util.Scanner;

/**
 * A program which converts user-given decimal numbers into the Binary equivalent
 * @author Tim Shumeyko (sacmunraga)
 */

public class DecToBin {
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in); // used for user input
      int decimalNumber;                     // user-entered decimal number
      String binaryNumber = "";              // binary number displayed in the end
      double testNum;                        // used to figure out how big the binary number is
      double i;                              // used in loops, also holds the greatest power
      String answer = "";                    // holds "1" or "0" which is displayed in the final string

      // get number to be converted
      System.out.print("Enter the decimal number to be converted to binary ");
      decimalNumber = scnr.nextInt();

      // This algorithm finds the power of 2 which is just greater than the decimal number the user
      // gave us. Right after this loop 1 is subtracted from i to make i the greatest power which does
      // not go over the decimal number.
      i = 0;
      testNum = 0;
      while (true){
         testNum = Math.pow(2, i);
         if (testNum > decimalNumber){
            break;
         }
         i++;
      }
      i -= 1;

      // This algorithm finds out if decimal number still has a remainder left after we subtract the
      // the result of 2 ^ i from decimal number. Even if we have a square of 2 (1, 2, 4, 8, 16, etc)
      // this algorithm will fill the remainig spaces with 0's.
      while (i >= 0) {
         if (decimalNumber - Math.pow(2, i) >= 0){
            answer = "1";
            decimalNumber -= Math.pow(2, i);
         } else {
            answer = "0";
         }

         // Adding either 0 or 1 to the string
         binaryNumber += answer;
         i--;

      }

      // Finally we report the answer to the user.
      System.out.println(binaryNumber);
   }
}
