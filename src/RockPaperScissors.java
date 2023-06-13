import java.util.Random;
import java.util.Scanner;
//Thanks to Coding with John youtube channel

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String[] rps = {"r", "p", "s"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while (true) {
                System.out.println("Please enter your move(r, p, or s)");
                playerMove = scanner.nextLine();
                if (playerMove.equals("r") || playerMove.equals("p") || playerMove.equals("s")) {
                    break;
                }
                System.out.println(playerMove + " is not valid move.");
            }
            System.out.println("computer played: " + computerMove);

            if (playerMove.equals(computerMove)) {
                System.out.println("The game  was a tie");
            } else if (playerMove.equals("r")) {
                if (computerMove.equals("p")) {
                    System.out.println("You lose");
                } else if (computerMove.equals("s")) {
                    System.out.println("You win");
                }
            } else if (playerMove.equals("p")) {
                if (computerMove.equals("s")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("r")) {
                    System.out.println("You win");
                }
            } else if (playerMove.equals("s")) {
                if (computerMove.equals("r")) {
                    System.out.println("You lose!");
                } else if (computerMove.equals("p")) {
                    System.out.println("You win");
                }
            }
            System.out.println("play again(y or n ?)");
            String playAgain = scanner.nextLine();
            if (!playAgain.equals("y")){
                break;
            }
        }
        scanner.close();

    }
}