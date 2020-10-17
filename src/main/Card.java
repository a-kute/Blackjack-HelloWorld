package main;

public class Card {
    private String denomination;
    private String suit;

    public Card(String denomination, String suit) {
        this.denomination = denomination;
        this.suit = suit;
    }

    public String getDenomination() {
        return this.denomination;
    }

    public String getSuit() {
        return this.suit;
    }

    public void setDenomination(String denomination) {
        this.denomination = denomination;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }
}
