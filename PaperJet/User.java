package PaperJet;

import java.util.Scanner;

public class User {
    private Scanner inputScanner;

    public User() {
        inputScanner = new Scanner(System.in);
    }

    public Bot getMove() {
        // Выведем запрос на ввод
        System.out.print("Rock, paper or scissors? ");

        // Прочитаем ввод пользователя
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        char firstLetter = userInput.charAt(0);
        if (firstLetter == 'R' || firstLetter == 'P' || firstLetter == 'S') {
            // Ввод корректный
            switch (firstLetter) {
                case 'R':
                    return Bot.ROCK;
                case 'P':
                    return Bot.PAPER;
                case 'S':
                    return Bot.SCISSORS;
            }
        }

        // Ввод некорректный. Выведем запрос на ввод снова.
        return getMove();
    }
    public boolean playAgain() {
        System.out.print("Do you want to play more? ");
        String userInput = inputScanner.nextLine();
        userInput = userInput.toUpperCase();
        return userInput.charAt(0) == 'Y';
    }

}