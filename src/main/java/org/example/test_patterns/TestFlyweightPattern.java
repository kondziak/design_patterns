package org.example.test_patterns;

import org.example.flyweight_pattern.*;

public class TestFlyweightPattern {

    public static void testFlyweightPattern() {
        ChessPiece blackPawn = new BlackPiece("Czarny Pionek","7", "a");
        ChessPiece whitePawn = new WhitePiece("Biały Pionek","2","a");
        ChessPiece blackQueen = new BlackQueen("Czarna Królowa");
        ChessPiece whiteQueen = new WhiteQueen("Biala Królowa");
        System.out.println(blackPawn.getColor()==blackQueen.getColor());
        System.out.println(whitePawn.getColor()==whiteQueen.getColor());
    }
}
