package Homework9;

public class CollectionImple implements CustomCollection {
    private Node first;
    private Node next;
    private int value = 0;

    private static class Node {
        String unit;
        Node next;
        Node previous;

        public Node(String element) {
            this.unit = element;
        }
    }

    @Override
    public boolean add(String str) {
        Node newNode = new Node(str);
        if (first == null) {
            newNode.next = null;
            newNode.previous = null;
            first = newNode;
        } else {
            next.next = newNode;
            newNode.previous = next;
        }
        next = newNode;
        value++;
        return true;
    }

    @Override
    public boolean addAll(CollectionImple strColl) {
        if (strColl == null || strColl.size() == 0) {
            return false;
        }
        for (int i = 0; i < strColl.value; i++) {
            add(strColl.get(i));
        }
        return true;
    }

    @Override
    public boolean delete(int index) {
        if (first == null) {
            return false;
        }
        if (index < 0 || index > size()) {
            return false;
        }
        Node p = first, p1 = null;
        int i = -1;
        while (p != null) {
            i++;
            if (i == index) {
                if (p1 == null) {
                    first = first.next;
                } else {
                    p1.next = p.next;
                }
            }
            p1 = p;
            p = p.next;
        }
        value--;
        return true;
    }

    @Override
    public boolean delete(String str) {
        Node current = first;
        Node previous = first;
        while (!(current.unit.equals(str))) {
            if (current.next == null)
                return false;
            else {
                previous = current;
                current = current.next;
            }
        }
        if (current == first)
            first = first.next;
        else {
            previous.next = current.next;
        }
        value--;
        return true;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= value) {
            throw new IndexOutOfBoundsException();
        }
        Node result = first;
        for (int i = 0; i < index; i++) {
            result = result.next;
        }

        return result.unit;
    }

    @Override
    public boolean contains(String str) {
        for (int i = 0; i < value; i++) {
            if (get(i).equals(str)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean clear() {
        first = null;
        next = null;
        value = 0;
        return true;
    }

    @Override
    public int size() {
        return value;
    }

    @Override
    public boolean trim() {
        return true;
    }

}