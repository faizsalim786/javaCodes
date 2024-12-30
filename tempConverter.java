import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the conversion type:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter the temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = (celsius * 9 / 5) + 32;
            System.out.println(celsius + " Celsius = " + fahrenheit + " Fahrenheit");
        } else if (choice == 2) {
            System.out.print("Enter the temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = (fahrenheit - 32) * 5 / 9;
            System.out.println(fahrenheit + " Fahrenheit = " + celsius + " Celsius");
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }
        
        scanner.close();
    }
}
