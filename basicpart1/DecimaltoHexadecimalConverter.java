//Write a Java program to convert a decimal number to a hexadecimal number.
package basicpart1;

import java.util.Scanner;

public class DecimaltoHexadecimalConverter {
        public static void main(String[] args) {
        int decimal ;
        Scanner input = new Scanner(System.in);
        System.out.print("Input a decimal number : ");
        decimal = input.nextInt();
        String Hexadecimal = Integer.toHexString(decimal).toUpperCase();
        System.out.print("Hexadecimal number is : ");
        System.out.println(Hexadecimal);
    }
}
