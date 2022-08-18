package PaperJet;

import java.util.Random;

public class Computer {
    public RockPaperScissors getMove() {
        RockPaperScissors[] moves = RockPaperScissors.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}