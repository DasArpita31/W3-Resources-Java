/*Write a Java program to accept two strings and test if the second string contains the first one.

Input first string: Once in a blue moon
Input second string: See eye to eye
If the second string contains the first one? false*/
package basicpart2;

import java.util.Scanner;

public class TestSubstringinString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input first string: ");
        String str1 = input.nextLine();

        System.out.print("Input second string: ");
        String str2 = input.nextLine();

        boolean result = str2.contains(str1);
        System.out.println("If the second string contains the first one? " + result);
    }
}
