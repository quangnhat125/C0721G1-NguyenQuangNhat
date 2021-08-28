package _10_dsa_list.bai_tap;

import java.util.Arrays;

class MyList<E> {
    int size = 0;
    static final int DEFAULT_CAPACITY = 0;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity > DEFAULT_CAPACITY) {
            int newSize = minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    private void ensureCapacity() {
        if (size >= elements.length) {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
    }

    public void add(int index, E element) {
        if (size == elements.length) {
            ensureCapacity();
        }
        elements[size++] = element;
    }

    public void remove(int index) {
        for (int i = index; i < size; i++) {
            elements[i] = elements[i + 1];
        }
        size--;
    }

    public int size() {
        return size;
    }

    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
        }
        return (E) elements[index];
    }
}

class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<Integer>();
        myList.add(0, 1);
        myList.add(1, 2);
        myList.add(2, 3);
        myList.add(3, 4);

    }
}