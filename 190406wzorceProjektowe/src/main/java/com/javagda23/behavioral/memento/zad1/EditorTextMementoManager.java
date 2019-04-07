package com.javagda23.behavioral.memento.zad1;

import java.util.ArrayDeque;
import java.util.Deque;

public class EditorTextMementoManager {

    private Deque<EditorTextMemento> mementos = new ArrayDeque<>();

    public void save(EditorTextMemento memento){
        mementos.push(memento);
    }

    public EditorTextMemento restore(){
        return mementos.pop();
    }
}
