package org.example.chain_of_responsibilities_pattern;

public abstract class Child {

    private Child tallerChild;

    public Child getTallerChild() {
        return tallerChild;
    }

    public void setTallerChild(Child tallerChild) {
        this.tallerChild = tallerChild;
    }

    public abstract void processRequest(MotherRequest motherRequest);
}
