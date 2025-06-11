//Write a Java program that takes a number as input and prints its multiplication table up to 10.

package basicpart1;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input a number:");
        int n = input.nextInt();
        for(int i=1;i<=10;i++){
            int res =1;
            res *= i;
        System.out.println(n+" x "+i+" = "+res);
        }
    }
}
