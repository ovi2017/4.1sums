import java.util.Scanner;

/**@author Ovidio Castillo
 *Purpose: To type a number and display factorial, addition of evens and fibonacci numbers
 *Date: 11/06/2017
 *License: GNU
 */

public class factor {
       public static void main(String args[]) {
           int n, fact = 1;
           int number = 5;
           Scanner keyboard = new Scanner(System.in);

           System.out.println("Type a number to Find Factorial");

           for (n = 1; n <= number; n++) {
               fact = fact * n;
           }
           System.out.println("Factorial of " + number + " is: " + fact);
       }
   }