package PaperJet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;
import java.util.Scanner;

public class UserP {
    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    private static final Logger loggerResult = LoggerFactory.getLogger("logger.result");
    private static Scanner inputScanner;
    ResourceBundle resourceBundle = ResourceBundle.getBundle("communicationWithPlayer", RunP.locale);

    public UserP() {
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
        TheFoundationP game = new TheFoundationP();
        System.out.print("Do you want to play more? ");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }

}