import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        
        System.out.print("Are you a citizen of the country? (yes/no): ");
        String citizenship = sc.next();
        
        boolean canVote = (age >= 18) && citizenship.equalsIgnoreCase("yes");
    
        if (canVote) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }
     
        sc.close();
    }
}