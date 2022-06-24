package HomeWork6;

public abstract class SubscribeService implements SubscriberServiceImpl {

    @Override
    public void print(Subscriber[] subs) {
        Subscriber[] subscribers = SubscriberGenerator.getSubArrayArray();
        System.out.println("все абоненты");
        for (Subscriber u : subscribers)
            System.out.println(u);
        System.out.println("____");
        System.out.println("студенты факультета право");
        for (Subscriber u : subscribers) {
            u.getTimeCityMin();
        }
    }
    }



