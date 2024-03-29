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
        stringCollection.firstAdd("186");
        System.out.println(stringCollection.size());
        System.out.println(stringCollection.get(2));
        stringCollection2.add(0, "3");
        stringCollection2.add(1, "15");
        stringCollection2.firstAdd("186");
        stringCollection2.firstAdd(null);
        stringCollection.firstAdd(null);
        System.out.println(stringCollection.contain("23"));
        System.out.println(stringCollection.equals(stringCollection2));
        stringCollection.add(2, "45");
        stringCollection.delete("45");
        stringCollection.add(3, null);
        stringCollection.delete(null);
        stringCollection.delete(null);


        //Реализация Итератора

        stringCollection2.add(0, "48");
        stringCollection2.add(1, "24");
        stringCollection2.add(2, "33");
        stringCollection2.add(3, "158");
        stringCollection2.add(4, "11");
        stringCollection2.iterator().remove();
        System.out.println(stringCollection2.iterator().next());
        stringCollection2.iterator().remove();
        System.out.println(stringCollection2.contain("33"));
        System.out.println(stringCollection2.iterator().hasNext());
        stringCollection2.iterator().forEach(stringCollection2);

    }
}
