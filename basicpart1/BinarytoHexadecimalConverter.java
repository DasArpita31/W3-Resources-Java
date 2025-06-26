//Write a Java program to convert a binary number to a hexadecimal number.
package basicpart1;

import java.util.Scanner;

public class BinarytoHexadecimalConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary number: ");
        String binary = sc.nextLine();
        int decimal = Integer.parseInt(binary, 2);
        String hex = Integer.toHexString(decimal).toUpperCase();
        System.out.println("Hexadecimal: " + hex);
    }
}


