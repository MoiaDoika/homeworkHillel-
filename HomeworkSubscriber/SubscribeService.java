package HomeworkSubscriber;

import java.util.ArrayList;

public class SubscribeService implements SubscriberServiceImpl {


    public void TimeCityMin(ArrayList<Subscriber> subscriber){
        System.out.println("Users whose time of intercity calls exceeds the specified 1200");
        System.out.println();
        for (Subscriber subscribers : subscriber) {
            int timeCityMin = 1200;
            if (subscribers.getTimeCityMin() > timeCityMin) {
                System.out.println("Patronymic: " + subscribers.getPatronymic() + ". Name: " + subscribers.getName() +
                        ". Surname: " + subscribers.getSurname() + ". Number Phone: " + subscribers.getNumberPhone() + ". Balance: " + subscribers.getBalance());
            }
        }
        System.out.println();
    }

    public void UserUseInterCityMin (ArrayList < Subscriber > subscriber) {
        System.out.println();
        System.out.println("Users who used long-distance communication");
        for (Subscriber subscribers : subscriber) {
            if (subscribers.getTimeInterCityMin() > 0) {
                System.out.println("Patronymic: " + subscribers.getPatronymic() + ". Name: " + subscribers.getName() +
                        ". Surname: " + subscribers.getSurname() + ". Number Phone: " + subscribers.getNumberPhone() + ". Balance: " + subscribers.getBalance());
            }
        }
        System.out.println();
    }

    public void FirstLetterParameter(ArrayList<Subscriber> subscriber){
        System.out.println("Information about subscribers full name, phone number, balance in which the first letter of the last name is transmitted as a parameter.");
        for (Subscriber subscribers : subscriber) {
            char[] ArrayPatronymic = subscribers.getPatronymic().toCharArray();
            char letter = 'P';
            if (ArrayPatronymic[0] == letter) {
                System.out.println("Patronymic: " + subscribers.getPatronymic() + ". Name: " + subscribers.getName() +
                        ". Surname: " + subscribers.getSurname() + ". Number Phone: " + subscribers.getNumberPhone() + ". Balance: " + subscribers.getBalance());
            }
        }
        System.out.println();
    }

    public int SumTraffic(ArrayList<Subscriber> subscriber){
        String city = "Kharkiv";
        System.out.println("The total consumption of Internet traffic for a particular city " + city);
        int result = 0;
        for (Subscriber subscribers : subscriber) {
            if (subscribers.getCity().equals(city)) {
                result += subscribers.getTraffic();
                System.out.println("Total Internet traffic consumption for Kharkiv = " + result);
            }
        }
        System.out.println();
        return result;
    }

    public int NumbNegativeBalance (ArrayList < Subscriber > subscriber) {
        System.out.println("Number of subscribers with negative balance");
        int count = 0;
        for (Subscriber subscribers : subscriber) {
            if (subscribers.getBalance() < 0) {
                count++;
                System.out.println("Information about subscribers with a negative balance " + ". Number Phone: " + subscribers.getNumberPhone());

            }
        }
        return count;
    }
}
