package PaperJet;

import java.util.Random;

public class Computer {
    public Bot getMove() {
        Bot[] moves = Bot.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}
