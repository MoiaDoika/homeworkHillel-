package Homework10;
import java.util.*;

public class Duplicate {
    public static <T> Collection<T> deleteDup(Collection<T> collection) {
        return new HashSet<>(collection);
    }
}