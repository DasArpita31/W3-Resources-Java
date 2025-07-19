/*Write a Java program to print an array after changing the rows and columns of a two-dimensional array.

Original Array:
10 20 30
40 50 60
After changing the rows and columns of the said array:10 40
20 50
30 60*/
package basicpart2;

public class Transpose2DArray {
    public static void main(String[] args) {
        int[][] original ={ {10,20,30},{40,50,60}};
        System.out.println("Original Array:");
        for (int i = 0; i < original.length; i++) {
            for (int j = 0; j < original[i].length; j++) {
                System.out.print(original[i][j] + " ");
            }
            System.out.println();
        }
        int rows = original.length;
        int cols = original[0].length;
        int[][] transposed = new int[cols][rows];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposed[j][i] = original[i][j];
            }
        }
        System.out.println("\nAfter changing the rows and columns of the said array:");
        for (int i = 0; i < transposed.length; i++) {
            for (int j = 0; j < transposed[i].length; j++) {
                System.out.print(transposed[i][j] + " ");
            }
            System.out.println();
        }
    }
}
