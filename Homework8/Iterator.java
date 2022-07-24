package Homework8;

public interface Iterator<String> {
    String next();

    boolean hasNext();

    void remove();

    void forEach(Collection collection);
}
