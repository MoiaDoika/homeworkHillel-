package PaperJet;

import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class TheFoundation {

    private User user;
    private Computer computer;
    private int userScore;
    private int win;
    private int lost;
    private int computerScore;
    private int numberOfGames;
    private String name;
    private static List<String> info = new ArrayList<>();


    public TheFoundation() {
        user = new User();
        computer = new Computer();
        userScore = 0;
        computerScore = 0;
        numberOfGames = 0;
    }

    public int getLost() {
        return lost;
    }

    public void setLost(int lost) {
        this.lost = lost;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Computer getComputer() {
        return computer;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public int getUserScore() {
        return userScore;
    }

    public void setUserScore(int userScore) {
        this.userScore = userScore;
    }

    public int getComputerScore() {
        return computerScore;
    }

    public void setComputerScore(int computerScore) {
        this.computerScore = computerScore;
    }

    public int getNumberOfGames() {
        return numberOfGames;
    }

    public void setNumberOfGames(int numberOfGames) {
        this.numberOfGames = numberOfGames;
    }
    public String getName() {
        System.out.println("Player, please,input your name");
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        System.out.println("Hello,"+ name+"!");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void startGame() {
        System.out.println("ROCK, PAPER, SCISSORS!");

        RockPaperScissors userMove = user.getMove();
        RockPaperScissors computerMove = computer.getMove();
        System.out.println("\nVASH HODE " + userMove + ".");
        System.out.println("Hod computer " + computerMove + ".\n");


        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0:
                info.add("USER MOVE : " + userMove + " " + "COMPUTER MOVE : " + computerMove + " -> TIES" + "\n");
                System.out.println("Tie!");
                break;
            case 1:
                info.add(userMove + " beats " + computerMove + " win -> " + name + "\n");
                System.out.println(userMove + " beats " + computerMove + " win -> " + name);
                System.out.println(userMove + " beats " + computerMove + ". You win!");
                userScore++;
                break;
            case -1:
                info.add(computerMove + " beats " + userMove + "  loss -> " + name + "\n");
                System.out.println(computerMove + " beats " + userMove + "  loss -> " + name);
                System.out.println(computerMove + " beats " + userMove + ". Wasted.");
                computerScore++;
                break;
        }
        numberOfGames++;


        if (user.playAgain()) {
            System.out.println();
            startGame();
        } else {
            printGameStats();
        }
    }

    public void printGameStats() {
        int wins = userScore;
        int losses = computerScore;
        int ties = numberOfGames - userScore - computerScore;
        double percentageWon = (wins + ((double) ties) / 2) / numberOfGames;
        info.add("NAMES : " + name + "\n" + "WINS : " + wins + "\n" + "LOSSES : " + losses + "\n" + "TIES : " + ties + "\n" + "GAMES PLAYED : " + numberOfGames + "\n" + "PERCENTAGE WON : " + percentageWon * 100 + "\n" + "\n" + "\n" + "\n");


        System.out.print("+");
        printDashes(68);
        System.out.println("+");


        System.out.printf("|  %6s  |  %6s  |  %6s  |  %12s  |  %14s  |\n",
                "WINS", "LOSSES", "TIES", "GAMES PLAYED", "PERCENTAGE WON");

        // Вывод линии
        System.out.print("|");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(10);
        System.out.print("+");
        printDashes(16);
        System.out.print("+");
        printDashes(18);
        System.out.println("|");

        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);

        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }



    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }

    public void resFile() throws IOException {
        Path leso = FileSystems.getDefault().getPath("").toAbsolutePath();
        String filename = "result.log";
        String s = leso.toAbsolutePath().toString();
        File file = new File(s, File.separator.concat(filename));

        if (file.exists()) {
            for (String str : info) {
                Files.write(Path.of(s + File.separator.concat(filename)), str.getBytes(), StandardOpenOption.APPEND);
            }
        } else {
            file.createNewFile();
            for (String str : info) {
                Files.write(Path.of(s + File.separator.concat(filename)), str.getBytes(), StandardOpenOption.APPEND);
            }
        }

    }
}
