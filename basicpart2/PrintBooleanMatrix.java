/*Write a Java program to print the contents of a two-dimensional Boolean array where t represents true and f represents false.

Sample array:
array = {{true, false, true},
{false, true, false}};
Expected Output :
t f t
f t f*/
package basicpart2;

public class PrintBooleanMatrix {
    public static void main(String[] args) {
        boolean[][] array ={{true,false,true},{false,true,false}};
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array[i].length;j++){
                if(array[i][j]){
                    System.out.print("t ");
                }
                else{
                    System.out.print("f ");
                }
            }
            System.out.println();
        }
    }
}
