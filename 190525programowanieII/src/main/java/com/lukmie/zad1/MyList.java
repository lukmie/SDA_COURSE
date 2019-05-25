package com.lukmie.zad1;

public class MyList<T> {

    private Cell<T> head;

    public void  add(T value) {
        if (head == null) {
            head = new Cell<T>(value, null);
        } else {
            getLastCell().setNext(new Cell<T>(value, null));
        }
    }

    private Cell<T> getLastCell() {
        Cell<T> currentCell = head;
        while(currentCell.getNext() != null) {
            currentCell = currentCell.getNext();
        }
        return currentCell;
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

    public T get(int i) {
        validateIndexInRange(i, 0, getSize() - 1);
        return getCell(i).getValue();
    }

    public void insert(int i, T value) {
        validateIndexInRange(i, 0, getSize());

        if (i == 0) {
            Cell<T> newCell = new Cell<>(value, head);
            head = newCell;
        } else {
            Cell<T> previous = getCell(i - 1);
            Cell<T> newCell = new Cell<T>(value, previous.getNext());

            previous.setNext(newCell);
        }
    }


    public void remove(int i) {
        validateIndexInRange(i, 0, getSize() - 1);
        if (i == 0) {
            head = head.getNext();
        } else {
            Cell<T> previous = getCell(i - 1);
            previous.setNext(previous.getNext().getNext());
        }
    }

    public void remove(T value) {
        Cell<T> currentCell = head;
        Cell<T> previous = null;
        while (currentCell != null){
            if (currentCell.getValue().equals(value)){
                if (currentCell == head){
                    head = head.getNext();
                    currentCell = currentCell.getNext();
                } else {
                    previous.setNext(currentCell.getNext());
                    currentCell = currentCell.getNext();
                }
            } else {
                previous = currentCell;
                currentCell = currentCell.getNext();
            }
        }
//        while(currentCell.getNext() == value) {
//            Cell<T> previous = current;
//            previous.setNext(previous.getNext().getNext());
//        }
    }

    public int search(T value) {
        Cell<T> currentCell = head;
        int i = 0;
        int index = -1;
        while(currentCell != null) {
            if (currentCell.getValue().equals(value)){
                index = i;
            }
            currentCell = currentCell.getNext();
            i++;
        }
        return index;
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

    private void validateIndexInRange(int i, int start, int end) {
        if (head == null || start < 0 || end < i) {
            throw new IndexOutOfBoundsException();
        }
    }

//    public int search(T value){
//        int size = 0;
//        Cell<T> current = head;
//        do {
//            size++;
//            current = current.getNext();
//        } while (current != null || current.getValue().equals(value));
//
//        return size;
//    }
}
