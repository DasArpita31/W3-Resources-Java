/*Write a Java program to prove that Euclid’s algorithm computes the greatest common divisor of two integers that have positive values.

According to Wikipedia "The Euclidean algorithm is based on the principle that the greatest common divisor of two numbers does not change if the larger number is replaced by its difference with the smaller number. For example, 21 is the GCD of 252 and 105 (as 252 = 21 × 12 and 105 = 21 × 5), and the same number 21 is also the GCD of 105 and 252 − 105 = 147. Since this replacement reduces the larger of the two numbers, repeating this process gives successively smaller pairs of numbers until the two numbers become equal. When that occurs, they are the GCD of the original two numbers. By reversing the steps, the GCD can be expressed as a sum of the two original numbers each multiplied by a positive or negative integer, e.g., 21 = 5 × 105 + (−2) × 252. The fact that the GCD can always be expressed in this way is known as Bézout's identity."

Expected Output:
result: 24
result: 1*/
package basicpart2;

import java.util.Scanner;

public class GCDUsingEuclidsAlgorithm {
    public static int gcd(int a,int b){
        if(b==0)
        return a;
        return gcd(b,a%b);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number for pair 1: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number for pair 1: ");
        int num2 = input.nextInt();
        System.out.println("result: " + gcd(num1, num2));

        // Take input for second pair
        System.out.print("Enter first number for pair 2: ");
        int num3 = input.nextInt();
        System.out.print("Enter second number for pair 2: ");
        int num4 = input.nextInt();
        System.out.println("result: " + gcd(num3, num4));


    }
}
