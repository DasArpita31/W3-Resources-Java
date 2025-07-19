/*Write a Java program that returns the largest integer but not larger than the base-2 logarithm of a specified integer.

Original Number: 2350
Result: 115*/
package basicpart2;

import java.util.Scanner;
public class LargestIntegerBase2Logarithm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int num;
       num=input.nextInt();
       int result=(int)(Math.floor(Math.log(num)/Math.log(2)));
        System.out.println("Original Number: " + num);
        System.out.println("Result: " + result);
    }
}
