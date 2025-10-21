import java.util.Random;
import java.util.Scanner;

public class CrapsSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain;
        boolean done = false;
        int point = 0;
        int sum = 0;
        int dieOne = 0;
        int dieTwo = 0;
        Random rand = new Random();

        do {
            System.out.println("The Rules of the Game ↓");
            System.out.println("1: There is an initial roll of 2 dice, resulting in a sum of 2 – 12");
            System.out.println("2: If the sum is 2, 3, or 12, it is called \"craps\" or \"crapping out\", and the game is over with a loss.");
            System.out.println("3: There is an initial roll of 2 dice, resulting in a sum of 2 – 12");
            System.out.println("4: There is an initial roll of 2 dice, resulting in a sum of 2 – 12");
            System.out.println("5: There is an initial roll of 2 dice, resulting in a sum of 2 – 12");

            for (int i = 1; i <= 1; i++) {
                dieOne = rand.nextInt(6) + 1;
                System.out.print("\n\nRoll 1: " + dieOne);
            }
            for (int i = 1; i <= 1; i++) {
                dieTwo = rand.nextInt(6) + 1;
                System.out.print("\nRoll 2: " + dieTwo);
            }
l
            sum = dieOne + dieTwo;
            System.out.println("\nSum: " + sum);


            System.out.println("\n\nDo you want to play again? Type [Y] for Yes or [N] for No.");
            if (scan.hasNextLine()) {
                playAgain = scan.nextLine();
                if (playAgain.equalsIgnoreCase("y")) {
                    done = false;
                } else if (playAgain.equalsIgnoreCase("n")) {
                    done = true;
                } else {
                    System.out.println("Invalid Please pick [Y] or [N]");
                }
            }
        } while (!done);
    }
}
