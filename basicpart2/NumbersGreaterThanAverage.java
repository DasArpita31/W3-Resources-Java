/*Write a Java program that finds numbers greater than the average of an array.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
The average of the said array is: 22.0
The numbers in the said array that are greater than the average are:
25
100*/
package basicpart2;

import java.util.Arrays;

public class NumbersGreaterThanAverage {
     public static void main(String[] args) {
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        double average = (double) sum / arr.length;
        System.out.println("The average of the said array is: " + average);
        System.out.println("The numbers in the said array that are greater than the average are:");
        for (int num : arr) {
            if (num > average) {
                System.out.println(num);
            }
        }
    }
}
