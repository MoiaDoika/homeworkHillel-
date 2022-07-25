package Homework13;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Среднее значение чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(55);
        numbers.add(33);
        numbers.add(11);
        numbers.add(22);
        numbers.add(44);

        System.out.println("Average value of numbers " + Collection.middleList(numbers));

        //Изменение на большой шрифт и возврат в колекцию List<Pair>
        List<String> stringsList = new ArrayList<>();
        stringsList.add("baby");
        stringsList.add("small");
        stringsList.add("chit");
        stringsList.add("child");
        stringsList.add("ant");
        stringsList.add("amoeba");
        stringsList.add("dot");

        System.out.println("Increase " + Collection.upperCase(stringsList));

        //Вывод слов изначально стостоящиеся из 4 букв и написаны маленьким шрифтом
        System.out.println(Collection.stringFilter(stringsList));



    }
}
