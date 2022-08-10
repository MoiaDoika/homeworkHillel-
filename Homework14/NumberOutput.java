package Homework14;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOutput {


    public static int[] intArray() throws IOException {
        System.out.println("Enter numbers");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String numbers = br.readLine();

        if (Figure(numbers)) {
            String[] arrayNumbers = numbers.split("");
            int[] numbersFromConsole = new int[numbers.length()];

            for (int i = 0; i < arrayNumbers.length; i++) {
                numbersFromConsole[i] = Integer.parseInt(arrayNumbers[i]);

            }
            return numbersFromConsole;
        } else System.out.println("Invalid input!");
        return intArray();
    }


    public static boolean Figure(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}