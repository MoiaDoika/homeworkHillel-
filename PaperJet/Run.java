package PaperJet;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    private static Scanner in = new Scanner(System.in);
    protected static int number = 0;

    public static void main(String[] args) throws IOException {
        TheFoundation game = new TheFoundation();
        game.getName();
        try {
            System.out.println("How many rounds do you want to play?");
            number = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter the number");
        }
        do {
            if (number == 0) {
                break;
            }
            System.out.println("Start game");
            game.startGame();
            number--;
        } while (number > 0 && User.playAgain());
        game.printGameStats();
        game.resFile();
    }
}