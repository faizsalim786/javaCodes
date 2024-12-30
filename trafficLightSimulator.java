import java.util.Scanner;

public class trafficLightSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the traffic light colour (green/yellow/red): ");
        String lightColour = sc.nextLine().toLowerCase();

        System.out.print("Is there an obstruction? (yes/no): ");
        String obsResponse = sc.nextLine().toLowerCase();

        boolean isObstacle = obsResponse.equals("yes");

        boolean canMove = !isObstacle && (lightColour.equals("green") || lightColour.equals("yellow"));

        if (isObstacle) {
            System.out.println("There is an obstacle. You cannot move.");
        } else {
            if (lightColour.equals("green")) {
                System.out.println("The light is green. Go!");
            } else if (lightColour.equals("yellow")) {
                System.out.println("The light is yellow. Slow down.");
            } else if (lightColour.equals("red")) {
                System.out.println("The light is red. Stop.");
            } else {
                System.out.println("Invalid traffic light colour entered.");
            }
        }

        sc.close();
    }
}