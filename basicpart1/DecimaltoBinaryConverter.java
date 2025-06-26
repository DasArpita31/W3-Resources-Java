//Write a Java program to convert an integer number to a binary number.
package basicpart1;

import java.util.Scanner;

public class DecimaltoBinaryConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int decimal;
        System.out.print("Input a Decimal Number : ");
        decimal = input.nextInt();
        String binary = Integer.toBinaryString(decimal);
        System.out.print("Binary number is : ");
        System.out.println(binary);
    }
}
