package com.lukmie.zad1;

import java.util.*;

public class MyList<T> implements List {

    private Cell<T> head;

    public void  addValue(T value) {
        if (head == null) {
            head = new Cell<T>(value, null);
        } else {
            getLastCell().setNext(new Cell<T>(value, null));
        }
    }

    public int getSize() {
        if (head == null) {
            return 0;
        }

        int size = 0;
        Cell<T> current = head;
        do {
            size++;
            current = current.getNext();
        } while (current != null);

        return size;

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(Object o) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    public T get(int i) {
        validateIndexInRange(i, getSize() - 1);
        return getCell(i).getValue();
    }

    @Override
    public Object set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, Object element) {

    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {
        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;
    }

    public void insert(int i, T value) {
        validateIndexInRange(i, getSize());

        if (i == 0) {
            head = new Cell<T>(value, head);
        } else {
            Cell<T> previous = getCell(i - 1);
            Cell<T> newCell = new Cell<T>(value, previous.getNext());

            previous.setNext(newCell);
        }
    }

    public void removeById(int id) {
        validateIndexInRange(id, getSize() - 1);
        if (id == 0) {
            head = head.getNext();
        } else {
            Cell<T> previous = getCell(id - 1);
            previous.setNext(previous.getNext().getNext());
        }
    }

    public void removeByValue(T value) {
        Cell<T> current = head;
        Cell<T> previous = null;
        while (current != null) {
            if (current.getValue().equals(value)) {
                if (current == head) {
                    head = head.getNext();
                    current = current.getNext();
                } else {
                    previous.setNext(current.getNext());
                    current = current.getNext();
                }
            } else {
                previous = current;
                current = current.getNext();
            }
        }
    }

    private Cell<T> getLastCell() {
        Cell<T> currentCell = head;
        while(currentCell.getNext() != null) {
            currentCell = currentCell.getNext();
        }
        return currentCell;
    }

    private Cell<T> getCell(int i) {
        Cell<T> currentCell = head;
        int currentId = 0;
        while(currentId < i) {
            currentCell = currentCell.getNext();
            currentId++;
        }
        return currentCell;
    }

    private void validateIndexInRange(int i, int end) {
        if (head == null || 0 < 0 || end < i) {
            throw new IndexOutOfBoundsException();
        }
    }
}