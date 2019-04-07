package com.javagda23.behavioral.memento.zad1;

public class EditorText {
    private String text = "";

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void addText(String text){
        this.text += text;
    }

    public void restoreFromMemento(EditorTextMemento memento){
        this.text = memento.getText();
    }

    @Override
    public String toString() {
        return "EditorText{" +
                "text='" + text + '\'' +
                '}';
    }
}
