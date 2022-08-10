package PaperJet;

public class TheFoundation {

    private User user;
    private Computer computer;
    private int userScore;
    private int win;
    private int lost;
    private int computerScore;
    private int numberOfGames;

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

    public void startGame() {
        System.out.println("ROCK, PAPER, SCISSORS!");

        // Получение ходов
        Bot userMove = user.getMove();
        Bot computerMove = computer.getMove();
        System.out.println("\nVASH HODE " + userMove + ".");
        System.out.println("Hod computer " + computerMove + ".\n");

        // Сравнение ходов и определение победителя
        int compareMoves = userMove.compareMoves(computerMove);
        switch (compareMoves) {
            case 0: // Ничья
                System.out.println("Tie!");
                break;
            case 1: // Победил игрок
                System.out.println(userMove + " beats " + computerMove + ". You win!");
                userScore++;
                break;
            case -1: // Победил компьютер
                System.out.println(computerMove + " beats " + userMove + ". Wasted.");
                computerScore++;
                break;
        }
        numberOfGames++;


        // Предложим пользователю сыграть еще раз
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

        // Вывод линии
        System.out.print("+");
        printDashes(68);
        System.out.println("+");

        // Вывод заголовков таблицы
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

        // Вывод значений
        System.out.printf("|  %6d  |  %6d  |  %6d  |  %12d  |  %13.2f%%  |\n",
                wins, losses, ties, numberOfGames, percentageWon * 100);

        // Вывод линии
        System.out.print("+");
        printDashes(68);
        System.out.println("+");
    }

    private void printDashes(int numberOfDashes) {
        for (int i = 0; i < numberOfDashes; i++) {
            System.out.print("-");
        }
    }
}