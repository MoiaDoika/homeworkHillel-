package PaperJet;

import java.io.IOException;

public class CheckResult {
    public static String checkResult(int gameResult, TheFoundation pl) throws IOException {
        String line = null;
        if( gameResult == 0){
            line = "ничья";
        }if(gameResult == 1){
            line = "Игрок " + pl.getUser() +" выиграл.";
            pl.setWin(pl.getWin() + 1);
        }if (gameResult == 2){
            line ="Компьтер выиграл";
            pl.setLost(pl.getLost() + 1);


        }
        return line;
    }
}