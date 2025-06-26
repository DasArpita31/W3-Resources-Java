//Write a Java program to convert a binary number to a decimal number.
package basicpart1;

import java.util.Scanner;

public class BinarytoDecimalConverter {
     public static void main(String[] args) {
        String binary;
        Scanner input = new Scanner(System.in);
        binary = input.nextLine();
        Integer decimal = Integer.parseInt(binary,2);
        System.out.println(decimal);
    }
}
