package org.example.chain_of_responsibilities_pattern;

public class Tomek extends Child {

    @Override
    public void processRequest(MotherRequest motherRequest) {
        if (Shelf.MEDIUM.equals(motherRequest.getShelf())) {
            System.out.println("Tomek zdjął słoik z półki");
        } else {
            getTallerChild().processRequest(motherRequest);
        }
    }
}
