//Write a Java program to print the ASCII value of a given character.
package basicpart1;

import java.util.Scanner;
public class ASCIIValueFinder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);
        int value = (int) ch;
        System.out.println("The ASCII value of Z is : "+value); 
    }
}
