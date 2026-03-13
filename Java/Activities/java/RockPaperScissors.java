import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        System.out.println("=== Rock Paper Scissors Game ===");
        System.out.println("Enter rock, paper, or scissors:");

        String userChoice = sc.nextLine().toLowerCase();

        // Check valid input
        if (!userChoice.equals("rock") && !userChoice.equals("paper") && !userChoice.equals("scissors")) {
            System.out.println("Invalid choice! Please enter rock, paper, or scissors.");
            sc.close();
            return;
        }

        String computerChoice = choices[random.nextInt(3)];

        System.out.println("You chose: " + userChoice);
        System.out.println("Computer chose: " + computerChoice);

        // Decide winner
        if (userChoice.equals(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (
            (userChoice.equals("rock") && computerChoice.equals("scissors")) ||
            (userChoice.equals("paper") && computerChoice.equals("rock")) ||
            (userChoice.equals("scissors") && computerChoice.equals("paper"))
        ) {
            System.out.println("You win!");
        } else {
            System.out.println("Computer wins!");
        }

        sc.close();
    }
}