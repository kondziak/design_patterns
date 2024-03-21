package org.example.test_patterns;

import org.example.chain_of_responsibilities_pattern.*;

public class TestChainOfResponsibilitiesPattern {

    public static void testChainOfResponsibilities() {
        MotherRequest motherRequest = new MotherRequest(Shelf.MEDIUM);
        Child tomek = new Tomek();
        Child ania = new Ania();
        Child antek = new Antek();
        tomek.setTallerChild(ania);
        ania.setTallerChild(antek);
        tomek.processRequest(motherRequest);
    }
}
