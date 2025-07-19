/*Write a Java program to transform a given integer into String format.

Expected Output:
Input an integer: 35
String format of the said integer: 35*/
package basicpart2;

import java.util.Scanner;

public class IntegertoStringFormat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
          System.out.print("Input an integer: ");
        int number = input.nextInt();

        // Convert integer to String
        String str = Integer.toString(number);

        System.out.println("String format of the said integer: " + str);
    }
}
