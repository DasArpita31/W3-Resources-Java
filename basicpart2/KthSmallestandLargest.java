/*Write a Java program to find the kth smallest and largest element in a given array. Elements in the array can be in any order.

Expected Output:
Original Array:
[1, 4, 17, 7, 25, 3, 100]
K'th smallest element of the said array:
3
K'th largest element of the said array:
25*/
package basicpart2;

import java.util.Arrays;

public class KthSmallestandLargest {
    public static void main(String[] args) {
        int[] arr = {1, 4, 17, 7, 25, 3, 100};
        int k = 2;

        System.out.println("Original Array:");
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        int kthSmallest = arr[k - 1];
        int kthLargest = arr[arr.length - k];
        System.out.println("K'th smallest element of the said array:");
        System.out.println(kthSmallest);
        System.out.println("K'th largest element of the said array:");
        System.out.println(kthLargest);
    }
}
