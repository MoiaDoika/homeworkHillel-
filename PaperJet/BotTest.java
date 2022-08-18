package PaperJet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BotTest {

    @Test
    void compareMoves() {
        assertEquals(0,  RockPaperScissors.PAPER.compareMoves(RockPaperScissors.PAPER));
        assertEquals(1,  RockPaperScissors.PAPER.compareMoves(RockPaperScissors.ROCK));
        assertEquals(-1,  RockPaperScissors.PAPER.compareMoves(RockPaperScissors.SCISSORS));
    }
}