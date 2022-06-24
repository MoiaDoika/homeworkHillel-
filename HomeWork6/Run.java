package HomeWork6;
public class Run {
    public static void main(String[] args) {
        Subscriber[] subs = SubscriberGenerator.getSubArrayArray(); // get users from method

        // todo: add functionality get user from console

        new SubscriberServiceImpl() {
            @Override
            public void print(Subscriber[] subscribers) {


            }
        }.print(subs);
    }
}

