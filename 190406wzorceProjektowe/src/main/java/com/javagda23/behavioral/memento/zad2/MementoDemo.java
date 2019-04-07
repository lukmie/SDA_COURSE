package com.javagda23.behavioral.memento.zad2;

public class MementoDemo {

    public static void main(final String[] args) {
        final EditorTextValue editorTextValue = new EditorTextValue("");

        final EditorTextValueMementoManager manager = new EditorTextValueMementoManager();
        manager.save(new EditorTextValueMemento(editorTextValue));

        editorTextValue.addText("started writing");
        manager.save(new EditorTextValueMemento(editorTextValue));

        editorTextValue.addText(" next sentence");
        manager.save(new EditorTextValueMemento(editorTextValue));

        editorTextValue.addText("\nAdded some more text");
        manager.save(new EditorTextValueMemento(editorTextValue));

        editorTextValue.addText(". And even more");

        editorTextValue.undoFromMemento(manager.restore());

        System.out.println(editorTextValue.getText());
    }
}