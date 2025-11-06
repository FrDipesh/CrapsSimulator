import java.util.Random;
import java.util.Scanner;

public class CrapsSimulator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String playAgain;
        boolean done = false;
        boolean validYN = false;
        int sum;
        int sumTwo;
        int dieOne = 0;
        int dieTwo = 0;
        Random rand = new Random();

        do {
            System.out.println("The Rules of the Game ↓");
            System.out.println("1: If the sum is 2, 3, or 12, it is called \"craps\" or \"crapping out\", and the game is over with a loss.");
            System.out.println("2: If the sum is 7 or 11, it is called a \"natural\" and the game is over with a win.");
            System.out.println("3: For all other values, the sum becomes \"the point\", and the user makes subsequent rolls until they either roll a 7, in which case they lose, or they roll the point sum, in which case they win.");

            for (int i = 1; i <= 1; i++) {
                dieOne = rand.nextInt(6) + 1;
                System.out.print("\n\nRoll 1: " + dieOne);
            }
            for (int i = 1; i <= 1; i++) {
                dieTwo = rand.nextInt(6) + 1;
                System.out.print("\nRoll 2: " + dieTwo);
            }

            sum = dieOne + dieTwo;
            System.out.println("\nSum: " + sum);
            if (sum == 7 || sum == 11) {
                System.out.println("You rolled a: " + sum + " You WIN!");
            }
            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You rolled a: " + sum + " You Crapped out.");
            }

            if (sum == 4 || sum == 5 || sum == 6 || sum == 8 || sum == 9 || sum == 10) {
                System.out.println("You must roll: " + sum + " to Win. If you roll a 7 it will result in a loss.");
                for (int i = 1; i <= 1; i++) {
                    dieOne = rand.nextInt(6) + 1;
                    System.out.print("\n\nRoll 1: " + dieOne);
                }
                for (int i = 1; i <= 1; i++) {
                    dieTwo = rand.nextInt(6) + 1;
                    System.out.print("\nRoll 2: " + dieTwo);
                    if (sum == 7) {
                        System.out.println("You rolled a 7 you lose");
                        if (sum == sum) {
                            System.out.println("You WIN!");
                        }
                    }
                    sumTwo = dieOne + dieTwo;
                    System.out.println("\nSum: " + sumTwo);
                    if (sum == sumTwo) {
                        System.out.println("You WIN!");
                    }
                    else {
                        System.out.println("You Lose!");
                    }



                }
            }

            do {
                System.out.println("\n\nDo you want to play again? Type [Y] for Yes or [N] for No.");
                if (scan.hasNextLine()) {
                    playAgain = scan.nextLine();
                    if (playAgain.equalsIgnoreCase("y")) {
                        done = false;
                        validYN = true;
                    } else if (playAgain.equalsIgnoreCase("n")) {
                        done = true;
                        validYN = true;
                    } else {
                        System.out.println("Invalid Please pick [Y] or [N]");
                    }
                }
            } while (!validYN);


        } while (!done);
    }
}
