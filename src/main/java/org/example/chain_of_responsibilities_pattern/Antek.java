package org.example.chain_of_responsibilities_pattern;

public class Antek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (Shelf.HIGH.equals(motherRequest.getShelf())) {
            System.out.println("Antek zdjął słoik z półki");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
