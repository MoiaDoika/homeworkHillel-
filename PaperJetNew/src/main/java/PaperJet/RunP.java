package PaperJet;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ResourceBundle;
import java.util.Locale;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunP {
    private static Scanner in = new Scanner(System.in);
    protected static int number = 0;
    static Locale locale;

    private static final Logger loggerDebug = LoggerFactory.getLogger("logger.debug");
    private static final Logger loggerResult = LoggerFactory.getLogger("logger.result");

    public static void main(String[] args) throws IOException {
        if (args.length==0){
            locale = new Locale("UA");
        }else {
            locale = new Locale(args[0]);
        }
        ResourceBundle resourceBundle = ResourceBundle.getBundle("communicationWithPlayer", locale);
        TheFoundationP game = new TheFoundationP();
        System.out.println(resourceBundle.getString("enter")); //enter
        game.getName();
        int num = 0;
        try {
            System.out.println(resourceBundle.getString("howManyTime")); //howManyTime
            number = in.nextInt();
            num = number;
            loggerResult.debug("How many game choose gamer : " + number);
        } catch (InputMismatchException e) {
            System.out.println(resourceBundle.getString("amountGame")); //amountGame
            loggerResult.debug("Invalid number of games entered");
        }
        do {
            if (number == 0) {
                break;
            }
            System.out.println(resourceBundle.getString("run")); //run
            game.startGame();
            number--;
            loggerResult.debug("How many games are left : " + number);
        } while (number != 0 && UserP.playAgain());
        loggerResult.debug("Games played : " + num);
        game.printGameStats();
        game.resFile();
        loggerResult.debug("Player left the game");
        loggerResult.debug("===============================================");
    }
}