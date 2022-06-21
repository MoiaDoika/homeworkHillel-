package HomeWork6;

import org.jetbrains.annotations.NotNull;

public class SubscribeService {
    public void print(Subscriber @NotNull [] subs) {

        for (Subscriber s : subs) {
            s.show();
        }
        System.out.println("Сведения об абонентах, у которых время внутригородских разговоров превышает 500мин.:");
        for (Subscriber s : subs) {
            s.TimeCityMin();
        }
        System.out.println("Сведения об абонентах, которые пользовались междугородней связью: ");
        for (Subscriber s : subs) {
            s.TimeInterCityMin();
        }

        System.out.println("Студенты с 2000г рождения:");
        for (Subscriber s : subs) {
            s.SurnameM();
        }
        System.out.println("Студенты c 18 группы:");
        for (Student s : stud) {
            s.Group("18");
        }
    }
}
