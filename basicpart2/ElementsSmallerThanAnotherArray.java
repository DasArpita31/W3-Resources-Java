/*Write a Java program to get the number of elements in a given array of integers that are smaller than the integer in another given array of integers.

Expected Output:
0
3
7*/
package basicpart2;

import java.util.Scanner;

public class ElementsSmallerThanAnotherArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in first array: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter number of elements in second array: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Result:");
        for (int num2 : arr2) {
            int count = 0;
            for (int num1 : arr1) {
                if (num1 < num2) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
