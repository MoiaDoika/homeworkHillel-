package Homework14;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        int [] array = NumberOutput.intArray();
        String[][] captcha = crSystem(array.length);

        for (int i = 0; i < array.length; i++) {
            String[][] bufferMatrix = Numbers.inputFigure(array[i]);

            for (int j = 0; j < bufferMatrix.length; j++) {
                for (int k =0  ; k < bufferMatrix[j].length; k++) {
                    captcha[j][k+i] = bufferMatrix[j][k];
                }
            }
        }

        for (int i = 0; i < captcha.length ; i++) {
            for (int j = 0; j < captcha[i].length; j++) {
                System.out.print(captcha[i][j]);
                System.out.print("|");
            }
            System.out.println();

        }
    }



    public static String[][] crSystem(int index){
        return new String[6][index];
    }
}