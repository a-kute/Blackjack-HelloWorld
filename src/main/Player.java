package main;

import java.util.ArrayList;

public class Player {
    private int score;
    private int bank;
    private int betAmount;
    private ArrayList<Card> hand;


    public Player(int bank) {
        this.bank = bank;
        hand = new ArrayList<>();
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void addToHand(Card card) {
        hand.add(card);
        score += card.getDenomination();
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
        bank -= betAmount;
    }

    public void win() {
        bank += betAmount;
    }






}
