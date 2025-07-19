/*Write a Java program to divide the two given integers using the subtraction operator.

Expected Output:
Input the dividend: 625
Input the divider: 25
Result: 25.0 */
package basicpart2;

import java.util.Scanner;
public class DivideUsingSubtraction {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the dividend: ");
        int dividend = input.nextInt();

        System.out.print("Input the divider: ");
        int divisor = input.nextInt();

        int count = 0;
        while (dividend >= divisor) {
            dividend = dividend - divisor;
            count++;
        }
        System.out.println("Result: " + count + ".0");
    }
}
