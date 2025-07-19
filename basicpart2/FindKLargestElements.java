/*Write a Java program to find the k largest elements in a given array. Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
3 largest elements of the said array are:
100 25 17*/
package basicpart2;

import java.util.Arrays;

public class FindKLargestElements {
    public static void main(String[] args) {
         int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 3;
        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(k + " largest elements of the said array are:");
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}
