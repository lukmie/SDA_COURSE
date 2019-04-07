package com.javagda23.behavioral.memento.zad1;

public class EditorTextMemento {

    private String text; //najlepiej jak ma takie same pola jak editor text

    public EditorTextMemento(EditorText editorText) {
        this.text = editorText.getText();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
