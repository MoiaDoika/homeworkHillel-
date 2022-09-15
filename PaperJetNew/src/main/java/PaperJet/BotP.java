package PaperJet;

public enum BotP {
    ROCK, PAPER, SCISSORS;

    public int compareMoves(BotP otherMove) {
        // Ничья
        if (this == otherMove)
            return 0;

        switch (this) {
            case ROCK:
                return (otherMove == SCISSORS ? 1 : -1);
            case PAPER:
                return (otherMove == ROCK ? 1 : -1);
            case SCISSORS:
                return (otherMove == PAPER ? 1 : -1);
        }

        return 0;
    }
}