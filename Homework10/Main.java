package Homework10;

import java.util.ArrayList;
import java.util.Collection;


public class Main {
    public static void main(String[] args) {
        //Реализация возврата коллекции без дупликаторов
        Collection<String> stringCollection = new ArrayList<>();

        stringCollection.add("dog");
        stringCollection.add("dog");
        stringCollection.add("human");
        stringCollection.add("tree");
        stringCollection.add("glass");
        stringCollection.add("human");
        stringCollection.add("grass");
        stringCollection.add("tree");
        stringCollection.add("glass");
        stringCollection.add("grass");

        System.out.println(NoDuplicate.removeDuplicates(stringCollection));

        //Реализация программы для вычисления корней квадратного уравнения
        System.out.println(QuadraticEquation.root(1.0, 12.0, 36.0));
    }
}
