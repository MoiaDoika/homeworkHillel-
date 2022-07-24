package Homework9;

public class Run {
    public static void main(String[] args) {
        CollectionImple humans1 = new CollectionImple();
        CollectionImple humans2 = new CollectionImple();
        humans1.add("Hum0");
        humans1.add("Hum1");
        humans1.add("Hum2");
        humans1.add("Hum3");
        humans1.add("Hum4");
        humans1.add("Hum5");
        humans1.add("Hum6");
        humans2.add("Hum15");
        humans2.add("Hum16");
        humans2.add("Hum17");
        humans2.add("Hum18");
        System.out.println(humans1.get(5));
        System.out.println(humans1.size());
        humans1.delete("Hum18");
        System.out.println(humans1.contains("Hum3"));
        humans1.addAll(humans2);
        System.out.println(humans1.size());
    }
}