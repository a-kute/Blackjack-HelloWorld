package main;

import java.util.ArrayList;

public class  Dealer {

    private int score;
    private ArrayList<Card> hand;
    private int aceCount;

    public Dealer() {
        hand = new ArrayList<>();
    }



    public void addToHand(Card card) {
        hand.add(card);
        if (card.getDenomination() == 1) {
            aceCount++;
        }
        score += card.getValue();
    }
    public ArrayList<Card> getHand() {
        return hand;
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

    public int getAceCount() {
        return aceCount;
    }

    public void setAceCount(int aceCount) {
        this.aceCount = aceCount;
    }
}
