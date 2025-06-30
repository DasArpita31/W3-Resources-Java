/*Write a Java program to compute hexagon area.
Area of a hexagon = (6 * s^2)/(4*tan(π/6))
where s is the length of a side*/
package basicpart1;

import java.util.Scanner;

public class HexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input the length of a side of the hexagon:");
        double s,area;
        s = input.nextDouble();

        double pi=Math.PI;
        System.out.print("The area of the hexagon is : ");
        area = (6*s*s)/(4*Math.tan(Math.PI/6));
        System.out.print(area);
    }
}
