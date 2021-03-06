package PaperJet;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Run {
    private static Scanner in = new Scanner(System.in);
    protected static int number = 0;

    public static void main(String[] args) {
        TheFoundation game = new TheFoundation();
        System.out.println("Player, please,input your name");
        Scanner scanner = new Scanner(System.in);
        String playerName = scanner.nextLine();
        System.out.println("Hello,"+ playerName+"!");
        try {
            System.out.println("How many time you want game ?");
            number = in.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Enter numbers");
        }
        do {
            if (number == 0) {
                break;
            }
            System.out.println("Run game ...");
            game.startGame();
            number--;
        } while (number > 0 && User.playAgain());
        game.printGameStats();
    }
}