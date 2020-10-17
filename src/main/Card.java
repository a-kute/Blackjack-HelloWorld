package main;

import java.awt.Image;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.*;

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

    public ImageIcon getImage() throws IOException {
        String singleCharDenomination = null;
        switch (denomination) {
            case 1:
                singleCharDenomination = "1";
                break;
            case 2:
                singleCharDenomination = "2";
                break;
            case 3:
                singleCharDenomination = "3";
                break;
            case 4:
                singleCharDenomination = "4";
                break;
            case 5:
                singleCharDenomination = "5";
                break;
            case 6:
                singleCharDenomination = "6";
                break;
            case 7:
                singleCharDenomination = "7";
                break;
            case 8:
                singleCharDenomination = "8";
                break;
            case 9:
                singleCharDenomination = "9";
                break;
            case 10:
                singleCharDenomination = "10";
                break;
            case 11:
                singleCharDenomination = "J";
                break;
            case 12:
                singleCharDenomination = "Q";
                break;
            case 13:
                singleCharDenomination = "K";
                break;
            case 14:
                singleCharDenomination = "A";
                break;
        }

        String singleCharSuit = null;
        switch(suit) {
            case "clubs":
                singleCharSuit = "C";
                break;
            case "hearts":
                singleCharSuit = "H";
                break;
            case "diamonds":
                singleCharSuit = "D";
                break;
            case "spades":
                singleCharSuit = "S";
                break;
        }

        File sourceimage = new File("Blackjack-HelloWorld/images/" + singleCharDenomination + singleCharSuit + ".png");
        Image image = ImageIO.read(sourceimage);
        return new ImageIcon(image);
    }
}
