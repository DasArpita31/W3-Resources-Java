//Write a Java program that takes two numbers as input and displays the product of two numbers.

package basicpart1;

import java.util.Scanner;

public class ProductofTwoNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.print("Input first number: ");
        int num1 = input.nextInt();
        System.out.print("Input second number: ");
        int num2 = input.nextInt();

        int mul = num1 * num2;
        System.out.println(num1+" X "+num2+ " = "+mul);
    }
}
