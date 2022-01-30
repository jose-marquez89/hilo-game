import java.util.Scanner;

public class HiLo {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain = "";

        do {
            int theNumber = (int)(Math.random() * 22 - 11);
            int guess = 0;
            while (guess != theNumber) {
                System.out.println("Guess a number between 1 and 10:");
                guess = scan.nextInt();

                if (guess < theNumber)
                    System.out.println(guess + " is too low. Try again.");
                else if (guess > theNumber)
                    System.out.println(guess + " is too high. Try again.");
                else
                    System.out.println(guess + " is correct. You win!");
            }
            System.out.println("Would you like to play again?");
            playAgain = scan.next();
        } while (playAgain.equalsIgnoreCase("y"));

        // close scan because eclipse said so
        System.out.println("I'm glad you decided to waste your precious time doing this. See you soon!");
        scan.close();
    }
}
