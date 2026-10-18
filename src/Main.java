import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Random rnd = new Random();
        Scanner in = new Scanner(System.in);
        boolean playAgain = false;

        do {
            int die1 = rnd.nextInt(6) + 1;
            int die2 = rnd.nextInt(6) + 1;
            int diceRoll = die1 + die2;

            System.out.println("Die 1 roll is: " + die1);
            System.out.println("Die 2 roll is: " + die2);
            System.out.println("Your total is: " + die1 + " + " + die2 + " = " + diceRoll);


            if (diceRoll == 2 || diceRoll == 3 || diceRoll == 12) {
                System.out.println("Aw crap! You crapped out! You lose.");
            } else if (diceRoll == 7 || diceRoll == 11) {
                System.out.println("You got a natural, you win!");
            } else {
                int point = diceRoll;
                System.out.println("The point is now " + point + ".");
                boolean done = false;

                do {
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    diceRoll = die1 + die2;

                    System.out.println("Die 1 roll is: " + die1);
                    System.out.println("Die 2 roll is: " + die2);
                    System.out.println("Your total is: " + die1 + " + " + die2 + " = " + diceRoll);

                    if (diceRoll == point) {
                        System.out.println("Made point and won.");
                        done = true;
                    } else if (diceRoll == 7) {
                        System.out.println("Got a seven and lost.");
                        done = true;
                    } else {
                        System.out.println("Trying for point.");
                    }
                } while (!done);
            }

            playAgain = SafeInput.getYNConfirm(in, "Do you want to play again");
        } while (playAgain);
    }
}