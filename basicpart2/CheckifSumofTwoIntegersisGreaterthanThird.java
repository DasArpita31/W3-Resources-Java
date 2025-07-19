/*Write a Java program that accepts three integers and checks whether the sum of the first two integers is greater than the third integer. Three integers are in the interval [-231, 231 ].

Input:

Input three integers (a,b,c):
5 8 9
Check whether (a + b) is greater than c?
true*/
package basicpart2;

import java.util.Scanner;

public class CheckifSumofTwoIntegersisGreaterthanThird {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input three integers (a, b, c): ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        boolean result = (long)a + (long)b > c;
        System.out.println("Check whether (a + b) is greater than c?");
        System.out.println(result);
    }
}
