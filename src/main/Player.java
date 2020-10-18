package main;

import java.util.ArrayList;

public class Player {
    private int score;
    private int bank;
    private int betAmount;
    private ArrayList<Card> hand;
    private int aceCount;


    public Player(int bank) {
        this.bank = bank;
        hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addToHand(Card card) {
        hand.add(card);
        if (card.getDenomination() == 1) {
            aceCount++;
        }
        score += card.getValue();
    }

    public void clearHand() {
        hand = new ArrayList<>();
        score = 0;
    }

    public int getBank() {
        return bank;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getBetAmount() {
        return betAmount;
    }

    public void add50() {
        betAmount += 50;
        bank -= 50;
    }

    public void add100() {
        betAmount += 100;
        bank -= 100;
    }

    public void add10() {
        betAmount += 10;
        bank -= 10;
    }

    public void add500() {
        betAmount += 500;
        bank -= 500;
    }

    public void loss() {
       betAmount = 0;
    }

    public void win() {
        bank += 2 * betAmount;
        betAmount = 0;
    }

    public int getAceCount() {
        return aceCount;
    }

    public void setAceCount(int aceCount) {
        this.aceCount = aceCount;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }
}
