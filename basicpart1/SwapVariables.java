//Write a Java program to swap two variables.

package basicpart1;

import java.util.Scanner;

public class SwapVariables {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int a,b,temp=0;
    System.out.print("Enter first number : ");
    a=input.nextInt();
    System.out.print("Enter second number : ");
    b=input.nextInt();

    System.out.println("Before swapping a = "+a+" b = "+b);
        temp=a;     
        a=b;
        b=temp;

    System.out.print("After swapping a = "+a+" b = "+b);

   } 
}
