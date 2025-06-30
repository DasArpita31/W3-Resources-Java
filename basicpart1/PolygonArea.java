/*Write a Java program to compute the area of a polygon.
Area of a polygon = (n*s^2)/(4*tan(π/n))
where n is n-sided polygon and s is the length of a side*/
package basicpart1;

import java.util.Scanner;

public class PolygonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n;
        double s,area;
        System.out.print("Input the number of sides on the polygon:");
        n = input.nextInt();
        System.out.print("Input the length of one of the sides:");
        s=input.nextDouble();

        area=((n*(s*s))/(4.0*(Math.tan(Math.PI/n))));
        System.out.println("The area is: "+area);
    }
}
