package Homework8;

import static org.junit.jupiter.api.Assertions.*;

class CollectionTest {

    @org.junit.jupiter.api.Test
    void firstTestAdd() {
        Collection<S> array = new Collection<S>();
        array.firstAdd("145");
        assertEquals("145",array.get(0));
    }

    @org.junit.jupiter.api.Test
    void testAdd() {
        Collection<S> array = new Collection<S>();
        array.firstAdd("123");
        array.firstAdd("123");
        array.firstAdd("123");
        array.firstAdd("123");
        array.add("123");
        assertEquals(3, array.size());
        assertEquals("24", array.get(1));
    }

    @org.junit.jupiter.api.Test
    void testDelete() {
        Collection<S> array = new Collection<S>();
        array.firstAdd("321");
        array.firstAdd("123");
        array.firstAdd("213");
        array.firstAdd("231");
        array.delete("231");
        assertEquals("213", array.get(2));
    }

    @org.junit.jupiter.api.Test
    void testGet() {
        Collection<S> array = new Collection<S>();
        array.firstAdd("321");
        array.firstAdd("123");
        array.firstAdd("213");
        array.firstAdd("231");
        assertEquals("231", array.get(3));
    }

    @org.junit.jupiter.api.Test
    void contain() {
        Collection<S> array = new Collection<S>();
        array.firstAdd("110");
        array.firstAdd("111");
        array.firstAdd("112");
        array.firstAdd("113");
        array.firstAdd("114");
        array.firstAdd("115");
        array.firstAdd("116");
        array.firstAdd("117");
        assertTrue(array.contain("115"));
        assertEquals(false, array.contain("1115"));
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
        Collection<S> array = new Collection<S>();
        Collection<S> arrayTo = new Collection<S>();
        Collection<S> arrayTol = new Collection<S>();
        array.firstAdd("110");
        array.firstAdd("111");
        array.firstAdd("112");
        array.firstAdd("113");
        array.firstAdd("114");
        array.firstAdd("115");
        arrayTo.firstAdd("110");
        arrayTo.firstAdd("111");
        arrayTo.firstAdd("112");
        arrayTo.firstAdd("113");
        arrayTo.firstAdd("114");
        arrayTo.firstAdd("115");
        arrayTol.firstAdd("110");
        arrayTol.firstAdd("111");
        arrayTol.firstAdd("112");
        arrayTol.firstAdd("113");
        arrayTol.firstAdd("114");
        arrayTol.firstAdd("115");
        assertEquals(false,array.equals(arrayTo));
        assertTrue(array.equals(arrayTol));
    }

    @org.junit.jupiter.api.Test
    void testClear() {
        Collection<S> array = new Collection<S>();
        array.firstAdd("110");
        array.firstAdd("111");
        array.firstAdd("112");
        array.firstAdd("113");
        array.firstAdd("114");
        array.firstAdd("115");
        array.clear();
        assertEquals(0,array.size());
    }

    @org.junit.jupiter.api.Test
    void size() {
        Collection<S> array = new Collection<S>();
        array.firstAdd("110");
        array.firstAdd("111");
        array.firstAdd("112");
        array.firstAdd("113");
        array.firstAdd("114");
        array.firstAdd("115");
        assertEquals(6,array.size());
    }
}