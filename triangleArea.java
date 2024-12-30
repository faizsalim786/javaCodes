import java.util.Scanner;

public class triangle{

    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of Base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the value of Height: ");
        double height = sc.nextDouble();

        double areaOfTriangle = 0.5*base*height;

        System.out.println("The Area of Trianle is: " + areaOfTriangle);

        sc.close();
            }
}