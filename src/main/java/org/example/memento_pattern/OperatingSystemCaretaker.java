package org.example.memento_pattern;

public class OperatingSystemCaretaker {

    private OperatingSystemMemento memento;

    public void addMemento(OperatingSystemMemento memento) {
        this.memento = memento;
        System.out.println("Adding operating system memento");
    }

    public OperatingSystemMemento getMemento() {
        return memento;
    }

}
