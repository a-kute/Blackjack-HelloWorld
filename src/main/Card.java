package main;

public class Card {
    private int denomination;
    private String suit;

    public Card(int denomination, String suit) {
        this.denomination = denomination;
        this.suit = suit;
    }

    public int getDenomination() {
        return this.denomination;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setDenomination(int denomination) {
        this.denomination = denomination;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
