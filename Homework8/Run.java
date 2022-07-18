package Homework8;

public class Run {
    public static void main(String[] args) {
        Collection stringCollection = new Collection();
        Collection stringCollection2 = new Collection();

        stringCollection.add(0, "3");
        stringCollection.add(1, "15");
        stringCollection.add(2, "23");
        stringCollection.add(3, "5");
        stringCollection.add(4, "106");
        stringCollection.delete("23");
        stringCollection.add("186");
        System.out.println(stringCollection.size());
        System.out.println(stringCollection.get(2));
        stringCollection2.add(0, "3");
        stringCollection2.add(1, "15");
        stringCollection2.add("186");
        stringCollection2.add(null);
        stringCollection.add(null);
        System.out.println(stringCollection.contain("23"));
        System.out.println(stringCollection.equals(stringCollection2));
        stringCollection.add(2, "45");
        stringCollection.delete("45");
        stringCollection.add(3, null);
        stringCollection.delete(null);
        stringCollection.delete(null);

    }
}
