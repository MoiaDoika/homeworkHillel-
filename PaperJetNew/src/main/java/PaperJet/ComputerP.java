package PaperJet;

import java.util.Random;

public class ComputerP {
    public RockPaperScissors getMove() {
        RockPaperScissors[] moves = RockPaperScissors.values();
        Random random = new Random();
        int index = random.nextInt(moves.length);
        return moves[index];
    }
}