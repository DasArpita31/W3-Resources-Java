//Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
package basicpart1;

import java.util.Scanner;

public class AverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n1,n2,n3,avg;
        System.out.print("Enter three numbers : ");
        n1=input.nextDouble();
        n2=input.nextDouble();
        n3=input.nextDouble();
        avg=(n1+n2+n3)/3;

        System.out.println("Average = "+avg);
        
    }
}
