public class Car {
    int volume;
    double expenditureOn100;
    int price;

    public Car() {
        volume = 64;
        expenditureOn100 = 5.2;
        price =35;
    }

    public void Name(String carName) {

        System.out.println("Сегодня мы отправляемся в Киев на " + carName + ".");
    }
    public void Road(double distance) {
        double ost1 = (volume - distance * (expenditureOn100 / 100));
        double ost2 = volume - ost1;
        if (distance == 178.5) {
            System.out.println("Остаток топлива по приезду "+ost1+"л.");
            System.out.println("Потраченное топливо Одесса-Кривое Озеро " + ost2 + " стоимостью на " + ost2 * price + "грн.");
        }
        if (distance == 152.8) {
            System.out.println("Остаток топлива по приезду "+ost1+"л.");
            System.out.println("Потраченное топливо Кривое Озеро-Жашков " + ost2 + " стоимостью на " + ost2 * price + "грн.");
        }
        if (distance == 148.2) {
            System.out.println("Остаток топлива по приезду "+ost1+"л.");
            System.out.println("Потраченное топливо Жашков-Киев " + ost2 + " стоимостью на " + ost2 * price + "грн.");
        }if (distance == 148.2+152.8+178.5) {
            System.out.println("Потраченное топливо Одесса-Киев " + ost2 + " стоимостью на " + ost2 * price + "грн.");
        }
    }

    public void Refueling(String results) {
        System.out.println("-----в пути-----");
        System.out.println("По приезду в пункт назначения " + results + " заправляем полный бак и подводим итоги...");
        System.out.println("-----заправка-----");
    }

    public static void main(String[] args) {
        Car SpeedCar = new Car();
        SpeedCar.Name("Volkswagen Golf");
        SpeedCar.Refueling("Кривое Озеро");
        SpeedCar.Road(178.5);
        SpeedCar.Refueling("Жашков");
        SpeedCar.Road(152.8);
        SpeedCar.Refueling("Киев");
        SpeedCar.Road(148.2);
        System.out.println("Итоги полной поездки");
        SpeedCar.Road(148.2+152.8+178.5);
    }
}
