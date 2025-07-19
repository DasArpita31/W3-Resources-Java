/*Write a Java program that accepts four integers from the user and prints equal if all four are equal, and not equal otherwise.

Sample Output:
Input first number: 25
Input second number: 37
Input third number: 45
Input fourth number: 23
Numbers are not equal!*/
package basicpart2;

import java.util.Scanner;

public class CheckFourNumbersEqual {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int first,second,third,fourth;
        System.out.print("Input first number : ");
        first = input.nextInt();
        System.out.print("Input second number : ");
        second = input.nextInt();
        System.out.print("Input third number : ");
        third = input.nextInt();
        System.out.print("Input fourth number : ");
        fourth = input.nextInt();
        if(first == second && second == third && third == fourth){
            System.out.println("Numbers are equal.");
        }
        else{
            System.out.println("Numbers are not equal!");
        }
    }
}
