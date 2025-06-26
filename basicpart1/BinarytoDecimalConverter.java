//Write a Java program to convert a binary number to a decimal number.
package basicpart1;
 import java.util.Scanner;

public class BinarytoDecimalConverter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a binary number: ");
        String binary = sc.nextLine();

        int decimal = Integer.parseInt(binary, 2);
        System.out.println("Decimal number:  " + decimal);
    }
}

