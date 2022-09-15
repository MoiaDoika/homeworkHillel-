package PaperJet;

import java.io.IOException;

public class CheckResultP {
    public static String checkResult(int gameResult, TheFoundationP pl) throws IOException {
        String line = null;
        if( gameResult == 0){
            line = "Tie";
        }if(gameResult == 1){
            line = "Player " + pl.getUser() +" WIN.";
            pl.setWin(pl.getWin() + 1);
        }if (gameResult == 2){
            line ="YOU LOSE!!!";
            pl.setLost(pl.getLost() + 1);


        }
        return line;
    }
}