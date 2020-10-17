package main;

import java.util.ArrayList;

public class Dealer {

    private int score;
    private ArrayList<Card> hand;

    public Dealer() {
        hand = new ArrayList<>();
    }

    public void addToHand(Card card) {
        hand.add(card);
        score += card.getValue();
    }

    public void clearHand() {
        hand = new ArrayList<>();
        score = 0;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

}
