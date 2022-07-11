package Homework7;


import java.util.ArrayList;

public class Run {
    public static void main(String[] args) {

        Arraylist arrayToArrayList = new Arraylist(5);

        arrayToArrayList.add("Jake");
        arrayToArrayList.add("Kelvin");
        arrayToArrayList.add("Sam");
        arrayToArrayList.add("Buch");
        arrayToArrayList.add("Anna");
        arrayToArrayList.add("Nana");
        arrayToArrayList.print();
        System.out.println();
        //1. public boolean add(int index, String value);
        arrayToArrayList.add(4,"Spy1");
        arrayToArrayList.print();
        System.out.println();
        //2. public boolean add(String value);
        arrayToArrayList.add("Spy2");
        arrayToArrayList.print();
        System.out.println();
        //3. public boolean delete(int index);
        arrayToArrayList.delete(2);
        arrayToArrayList.print();
        System.out.println();
        System.out.println(arrayToArrayList.get(4));
        //4. public boolean delete(String value);
        arrayToArrayList.delete("Bora");
        arrayToArrayList.print();
        System.out.println();
        //5. public String get(int index);
        System.out.println(arrayToArrayList.get(8));
        System.out.println(arrayToArrayList.get(2));
        System.out.println(arrayToArrayList.getCount() + "  characters left continue playing");
    }
}