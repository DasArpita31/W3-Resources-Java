//Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.

package basicpart1;

import java.util.Scanner;

public class BasicArithmeticOperations {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input first number:");
        int num1 = input.nextInt();
        System.out.print("Input last number:");
        int num2 = input.nextInt();
        int sum= num1+num2;
        int sub= num1-num2;
        int mul= num1*num2;
        int div= num1/num2;
        int rem= num1%num2;
        System.out.println( num1+ " + "+num2+" = "+sum);
        System.out.println( num1+ " - "+num2+" = "+sub);
        System.out.println( num1+ " * "+num2+" = "+mul);
        System.out.println( num1+ " / "+num2+" = "+div);
        System.out.println( num1+ " mod "+num2+" = "+rem);
    }
}
