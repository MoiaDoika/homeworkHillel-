package HomeworkSubscriber;

public class Run {
    public static void main(String[] args) {
        SubscribeService sub = new SubscribeService();
        sub.TimeCityMin(SubscriberGenerator.getSubscriber());
        sub.UserUseInterCityMin(SubscriberGenerator.getSubscriber());
        sub.FirstLetterParameter(SubscriberGenerator.getSubscriber());
        sub.SumTraffic(SubscriberGenerator.getSubscriber());
        sub.NumbNegativeBalance(SubscriberGenerator.getSubscriber());
    }
}