import java.util.Scanner;

public class depoCalculate {
    public static void main(String[] args) {
        //использум методы класса Сканер
        Scanner input = new Scanner(System.in);

        //Считываем сумму денежного вклада в гривнах
        System.out.println("Введите сумму, вашего вклада:");
        double contribution = input.nextDouble();
        //Считываем длительность вклада
        System.out.println("Введите количетво лет: ");
        int term
                = input.nextInt();
        //Считываем процентную ставку
        System.out.println("Введите процент вашего депозита: ");
        double percernt = input.nextDouble();


        //Назначение и вычисление начисленных процентов
        double impact = 0;
        for (int i = 1; i <= term; i++) {
            impact = (contribution * percernt * i) / 100;
            //преобразование переменной в строку и округление
            String result = String.format("%.2f", impact);
            //Вывод процентной ставки ежегодно
            System.out.println( "Начисленный годовой % за " +i+" год: " + result + " грн");
        }
        contribution += impact;
        //Вывод конечной суммы
        System.out.println("Конечная накопленная сумма: " + contribution + " грн");
    }
}
