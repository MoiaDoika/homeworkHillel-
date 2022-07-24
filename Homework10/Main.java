package Homework10;

import java.util.ArrayList;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        Collection<String> stringCollection = new ArrayList<>();
        stringCollection.add("1");
        stringCollection.add("1");
        stringCollection.add("3");
        stringCollection.add("5");
        stringCollection.add("3");
        stringCollection.add("2");
        stringCollection.add("5");
        stringCollection.add("6");
        stringCollection.add("7");
        stringCollection.add("8");
        System.out.println(NoDuplicate.removeDuplicates(stringCollection));
        System.out.println(SquareRoot.root(2.0, 5.0, 6.0));
    }
}
