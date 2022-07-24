package Homework9;

public interface CustomCollection {

    boolean add(String str);
    boolean addAll(CollectionImple strColl);
    boolean delete(int index);
    boolean delete(String str);
    String get(int index);
    boolean contains(String str);
    boolean clear();
    int size();
    boolean trim();
}
