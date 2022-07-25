package Homework13;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {

    @Test
    void middleList() {

        List<Integer> integerList = new ArrayList<>();

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);

        assertEquals(2,Collection.middleList(integerList));
    }

    @Test
    void upperCase() {

        List<String> stringsList = new ArrayList<>();

        List<Pair> pairs = new ArrayList<>();
        stringsList.add("baby");
        Pair pair = new Pair("baby");
        pairs.add(pair);

        assertEquals(pairs.toString(),Collection.upperCase(stringsList).toString());
    }

    @Test
    void stringFilter() {

        List<String> stringsList = new ArrayList<>();

        stringsList.add("baby");
        stringsList.add("ant");
        stringsList.add("amoeba");
        stringsList.add("chit");

        assertEquals("[baby, chit]",Collection.stringFilter(stringsList).toString());
    }
}