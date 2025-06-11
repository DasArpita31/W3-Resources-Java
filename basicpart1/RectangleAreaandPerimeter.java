//Write a Java program to print the area and perimeter of a rectangle.

package basicpart1;

public class RectangleAreaandPerimeter {
    public static void main(String[] args) {
        double width = 5.5;
        double height = 8.5;

        double area = width * height;
        Double perimeter = 2*(height + width);
        System.out.println("Area is " +width+" * "+height+" = "+area);
        System.out.println("Perimeter is 2 * ("+width+" + "+height+") = "+perimeter);
    }
}
