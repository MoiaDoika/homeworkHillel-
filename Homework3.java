import java.util.*;

public class Homework3 {
    private void cycle99(){
        for (int i = 0; i <= 99; i++) {
            if(i % 2 != 0) {
                System.out.println("Решение "+i);
            }
        }
    }
    private void factor(){
        int n = 1;
        int num = 1;
        for (int i = 1; i <= n; i ++){
            num *=i;
            System.out.println(num);
        }
        System.out.println("Решение " + num);
    }
    private void whileCycle99(){
        int i= 0;
        while (i <= 99) { i++;
            if(i % 2 != 0) {
                System.out.println("Решение "+i);
            }
        }
    }
    private void doWhileFactor(){
        int n = 4;
        int num = 1;int i = 1;
        do{ i++;
            num *=i;
        }while(i <n);
        System.out.println("Решение "+num);
    }
    private void calculation(){
        {
            int x =3;
            int n = 5;
            int cup;
            cup = n / 2;
            if (n % 2 == 0)
                System.out.println("Решение "+(cup*cup));
            else
                System.out.println("Решение "+(x*cup*cup));
        }
    }
    private void negativeConclusion(){
        for (int i = 0; i > -50; i-=5) {
            System.out.println("Решение "+i);
        }
    }
    private void multiplicationTable(){
        //любое значение
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("Решение "+i + " x " + j + " = " + (i*j));
            }
        }
    }
    private void arrays() {
        int[] arr = new int[10];
        for(int i = 0; i < 10; i++)
            arr[i] = 2*i+1;
        System.out.print("Решение "+Arrays.toString(arr));
    }
    private void minArray(){
        int[] N = {32,43,53,23,1,43};
        int small = N[0];
        for(int i=0;i<N.length;i++) {
            for(int j=i+1;j<N.length;j++) {
                if(N[i] > N[j]) {
                    small = N[i];
                    N[i] = N[j];
                    N[j] = small;
                }
            }
        }
        System.out.println("Наменьший элемент это " + N[0]);
    }
    private void maxArray(){
        int[] N = {32,43,53,23,1,43};
        int max = N[0];
        for(int i=0;i<N.length;i++) {
            for(int j=i+1;j<N.length;j++) {
                if(N[i] < N[j]) {
                    max = N[i];
                    N[i] = N[j];
                    N[j] = max;
                }
            }
        }
        System.out.println("Дан массив размерности N, найти наибольший элемент массива и вывести на консоль (массив заполнить случайными числами из диапазона 0 .. 100)");
        System.out.println("Наибольший элемент это " + N[0]);
    }
    private void Castling(){
        int[] arr = {4, -5, 0, 6, 8};
        int max = arr[0];
        int min = arr[0];
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                maxInd = i;
                max = arr[i];
            }
            if (min < arr[i]) {
                minInd = i;
                min = arr[i];
            }
        }
        int temp = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = temp;
        System.out.println("Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.");
        Arrays.stream(arr).forEach(System.out::println);
    }
    private void Chess(){
        String [][] chessBoard = new String[8][8];
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[0].length; j++) {
                if ((i + j) % 2 == 0) chessBoard[i][j] = "W";
                else chessBoard[i][j] = "B";
            }
        }

        for (String[] strings : chessBoard) {
            for (int j = 0; j < chessBoard[0].length; j++) System.out.print(" " + strings[j] + " ");
            System.out.println();
        }
        System.out.println("Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)");
        }

    public static void main(String[] args) {
      Homework3 objectJoke = new Homework3();
        System.out.println("При помощи цикла for вывести на экран нечетные числа от 1 до 99.");
        objectJoke.cycle99();
        System.out.println("Дано число n при помощи цикла for посчитать факториал n!");
        objectJoke.factor();
        System.out.println("Перепишите программы (1 и 2) с использованием цикла while.");
        objectJoke.whileCycle99();
        System.out.println("Перепишите программы (1 и 2) с использованием цикла do - while.");
        objectJoke.doWhileFactor();
        System.out.println("Даны переменные x и n вычислить x^n.");
        objectJoke.calculation();
        System.out.println("Вывести 10 первых чисел последовательности 0, -5,-10,-15..");
        objectJoke.negativeConclusion();
        System.out.println("Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10)");
        objectJoke.multiplicationTable();
        System.out.println("Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.");
        objectJoke.arrays();
        System.out.println("Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (массив заполнить случайными числами из диапазона 0 .. 100)");
        objectJoke.minArray();
        objectJoke.maxArray();
        objectJoke.Castling();
        objectJoke.Chess();

    }
}
