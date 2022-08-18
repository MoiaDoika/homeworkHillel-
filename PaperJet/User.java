package PaperJet;

import java.util.Scanner;

public class User {
    private static Scanner inputScanner;

    public User() {
        inputScanner = new Scanner(System.in);
    }

    public RockPaperScissors getMove() {
        System.out.print("Rock, paper or scissors? ");

        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        char firstLetter = userInput.charAt(0);
        if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
            switch (firstLetter) {
                case 'R':
                    return RockPaperScissors.ROCK;
                case 'P':
                    return RockPaperScissors.PAPER;
                case 'S':
                    return RockPaperScissors.SCISSORS;
            }
        }

        return getMove();
    }
    public static boolean playAgain() {
        TheFoundation game = new TheFoundation();
        System.out.print("Do you want to play more? ");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }

}