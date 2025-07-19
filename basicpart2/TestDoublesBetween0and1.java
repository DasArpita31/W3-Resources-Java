/*Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise.

Sample Output:
Input first number: 5
Input second number: 1
false*/

package basicpart2;

import java.util.Scanner;

public class TestDoublesBetween0and1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double first,second;
        System.out.print("Input first number : ");
        first = input.nextDouble();
        System.out.print("Input second number : ");
        second = input.nextDouble();
        System.out.println(first > 0 && first<1 && second>0 && second<1);
    }
}
