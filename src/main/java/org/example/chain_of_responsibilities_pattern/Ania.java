package org.example.chain_of_responsibilities_pattern;

public class Ania extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (Shelf.LOW.equals(motherRequest.getShelf())) {
            System.out.println("Ania zdjęła słoik z półki");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
