package HomeWork6;

import java.util.ArrayList;

public class SubscribeService implements SubscriberServiceImpl {


    public void TimeCityMin(ArrayList<Subscriber> subscriber){
            System.out.println("Пользователи у которых время внутрегородских разговоров превышает заданное");
            System.out.println();
            for (Subscriber subscribers : subscriber) {
                int timeCityMin = 2200;
                if (subscribers.getTimeCityMin() > timeCityMin) {
                    System.out.println(subscribers);
                }
            }
            System.out.println();
        }

        public void UserUseInterCityMin (ArrayList < Subscriber > subscriber) {
            System.out.println();
            System.out.println("Пользователи которые пользовались межгородской связью");
            for (Subscriber subscribers : subscriber) {
                if (subscribers.getTimeInterCityMin() > 0) {
                    System.out.println(subscribers);
                }
            }
            System.out.println();
        }

        public void FirstLetterParameter(ArrayList<Subscriber> subscriber){
            System.out.println("Cведения об абонентах ФИО, номер телефона, баланс у который первая бука фамилии передается как параметр.");
            for (Subscriber subscribers : subscriber) {
                char[] ArrayPatronymic = subscribers.getPatronymic().toCharArray();
                char letter = 'С';
                if (ArrayPatronymic[0] == letter) {
                    System.out.println("Отчество: " + subscribers.getPatronymic() + "Имя: " + subscribers.getName() +
                            "Фамилия: " + subscribers.getSurname() + "Номер телефона: " + subscribers.getNumberPhone() + "Баланс: " + subscribers.getBalance());
                }
            }
            System.out.println();
        }

        public int SumTraffic(ArrayList<Subscriber> subscriber){
            String city = "Одесса";
            System.out.println("Суммарное потребление трафика интернета для определенного города " + city);
            int result = 0;
            for (Subscriber subscribers : subscriber) {
                if (subscribers.getCity().equals(city)) {
                    result += subscribers.getTraffic();
                }
            }
            return result;
        }

        public int NumbNegativeBalance (ArrayList < Subscriber > subscriber) {
            System.out.println("Количество абонентов с отрицательны балансом");
            int count = 0;
            for (Subscriber subscribers : subscriber) {
                if (subscribers.getBalance() < 0) {
                    count++;
                }
            }
            return count;
        }
    }




