import java.util.Scanner;

public class simpleInterest{

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Principal Amount: ");
        double principal = sc.nextDouble();

        System.out.print("Enter the rate of Interest: ");
        double rate = sc.nextDouble();

        System.out.print("Enter the Time: ");
        double time = sc.nextDouble();

        double simpleInterest = (principal*rate*time)/100;

        System.out.println("The Simple Interest is: " + simpleInterest);

        sc.close();
        
            }
}