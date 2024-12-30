import java.util.Scanner;

public class circleCalculation{

    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of circle: ");
        double radius = sc.nextDouble();

        double pi = Math.PI;

        double circumference = 2*pi*radius;

        double areaOfCircle = pi*radius*radius;

        System.out.println("The circumference of circle is: " + circumference);
        System.out.println("The area of circle is: " + areaOfCircle);

        sc.close();
        }
}