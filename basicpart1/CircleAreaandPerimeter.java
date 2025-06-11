//Write a Java program to print the area and perimeter of a circle.
package basicpart1;

import java.util.Scanner;

public class CircleAreaandPerimeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius;
        System.out.print("Radius = ");
        radius = input.nextDouble();
        double perimeter = 2*Math.PI*radius;
        double area = Math.PI*radius*radius;
        System.out.println("Perimeter is = "+perimeter);
        System.out.println("Area is = "+area);

    }
}
