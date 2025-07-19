/*Write a Java program to multiply two given integers without using the multiply operator (*).

Input the first number: 25
Input the second number: 5
Result: 125*/
package basicpart2;

import java.util.Scanner;

public class MultiplyWithoutOperator {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Input the second number: ");
        int num2 = scanner.nextInt();

        int result = multiply(num1, num2);
        System.out.println("Result: " + result);
    }
    public static int multiply(int a, int b) {
        int result = 0;
        int positiveB = Math.abs(b);
        int positiveA = Math.abs(a);
        for (int i = 0; i < positiveB; i++) {
            result += positiveA;
        }
        if ((a < 0 && b > 0) || (a > 0 && b < 0)) {
            result = -result;
        }
        return result;
    }
}
