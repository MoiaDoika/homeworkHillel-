package Homework8;

public interface InterFace {
    boolean firstAdd(String o);
    boolean add(int index, String o);
    boolean delete (String o);
    String get(int index);
    boolean contain(String o);
    boolean equals (InterFace str);
    boolean clear();
    int size();
}
