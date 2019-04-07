package com.javagda23.behavioral.memento.zad2;

public class EditorTextValue {
    private String text;

    public EditorTextValue(final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(final String text) {
        this.text = text;
    }

    public void addText(final String text) {
        this.text += text;
    }

    public void undoFromMemento(final EditorTextValueMemento memento) {
        this.text = memento.getText();
    }

    @Override
    public String toString() {
        return "EditorTextValue{" +
                "text='" + text + '\'' +
                '}';
    }
}
