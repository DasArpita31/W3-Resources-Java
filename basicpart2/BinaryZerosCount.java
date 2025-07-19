/*Write a Java program that will accept an integer and convert it into a binary representation. Now count the number of bits equal to zero in this representation.

Expected Output:
Input first number: 25
Binary representation of 25 is: 11001
Number of zero bits: 2*/
package basicpart2;

import java.util.Scanner;

public class BinaryZerosCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input first number: ");
        int num = scanner.nextInt();
        String binary = Integer.toBinaryString(num);
        System.out.println("Binary representation of " + num + " is: " + binary);
        int zeroCount = 0;
        for (char ch : binary.toCharArray()) {
            if (ch == '0') {
                zeroCount++;
            }
        }
        System.out.println("Number of zero bits: " + zeroCount);
    }
}
