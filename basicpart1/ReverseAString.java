//Write a Java program to reverse a string.
package basicpart1;

import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print("Input a string : ");
        String str=input.nextLine();

        String reversed = new StringBuilder(str).reverse().toString();
        System.out.println("Reverse string :"+reversed);
    }
}
