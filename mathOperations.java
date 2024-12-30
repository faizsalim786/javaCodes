import java.util.Scanner;

public class mathOperation{

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the First Number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the Second Number: ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        int subtract = num1-num2;
        int multiply = num1*num2;
        double divide = num1/num2;

        System.out.println("The Addition of Two numbers are: " + sum);
        System.out.println("The Substraction of Two numbers are: " + subtract);
        System.out.println("The Multiplication of Two numbers are: " + multiply);
        System.out.println("The Division of Two numbers are: " + divide);

        sc.close();
            }
}