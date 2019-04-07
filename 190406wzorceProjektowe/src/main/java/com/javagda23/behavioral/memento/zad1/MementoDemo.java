package com.javagda23.behavioral.memento.zad1;

public class MementoDemo {
    public static void main(String[] args) {
        EditorText editorText = new EditorText();

        EditorTextMementoManager manager = new EditorTextMementoManager();

        editorText.addText("SDA is awsame.\n");
        manager.save(new EditorTextMemento(editorText));

        editorText.addText("DP are cool.\n");
        manager.save(new EditorTextMemento(editorText));

        editorText.addText("DP are cool. nooooooooooooooo\n");
        manager.save(new EditorTextMemento(editorText));

        editorText.addText("This should not be displayed\n");
        manager.save(new EditorTextMemento(editorText));

        manager.restore();
        editorText.restoreFromMemento(manager.restore());

    }
}
