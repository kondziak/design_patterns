package org.example.flyweight_pattern;

public class ChessPiece {
    private String name, numberPosition, letterPosition;
    private Color color;

    public ChessPiece(String name, String numberPosition, String letterPosition, String color) {
        this.name = name;
        this.numberPosition = numberPosition;
        this.letterPosition = letterPosition;
        switch (color) {
            case "black":
                this.color = ColorRepository.getBlack();
                break;
            case "white":
                this.color = ColorRepository.getWhite();
                break;
        }
    }

    public Color getColor() {
        return color;
    }
}
