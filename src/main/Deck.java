package main;

import java.util.Random;


public class Deck {
    private Card[] deckArray = new Card[52];

    public Deck() {
    }

    public Card[] getDeckArray() {
        return deckArray;
    }

    //populates a new unshuffled deck, can also be used to reset the deck to a base state
    public void createDeck() {
        int newDenomination;
        String newSuit;
        int count = 0;
        for(int i = 0; i < 4; i++) {
            for(int j = 0; j < 13; j++) {
                switch(i) {
                    case 0:
                        newSuit = "clubs";
                        break;
                    case 1:
                        newSuit = "diamonds";
                        break;
                    case 2:
                        newSuit = "hearts";
                        break;
                    case 3:
                        newSuit = "spades";
                        break;
                    default:
                        newSuit = null;
                }
                switch(j) {
                    case 0:
                        newDenomination = 1;
                        break;
                    case 1:
                        newDenomination = 2;
                        break;
                    case 2:
                        newDenomination = 3;
                        break;
                    case 3:
                        newDenomination = 4;
                        break;
                    case 4:
                        newDenomination = 5;
                        break;
                    case 5:
                        newDenomination = 6;
                        break;
                    case 6:
                        newDenomination = 7;
                        break;
                    case 7:
                        newDenomination = 8;
                        break;
                    case 8:
                        newDenomination = 9;
                        break;
                    case 9:
                        newDenomination = 10;
                        break;
                    case 10:
                        newDenomination = 11;
                        break;
                    case 11:
                        newDenomination = 12;
                        break;
                    case 12:
                        newDenomination = 13;
                        break;
                    case 13:
                        newDenomination = 14;
                        break;
                    default:
                        newDenomination = 0;
                }
                deckArray[count] = new Card(newDenomination, newSuit);
                count++;
            }
        }
    }

    //shuffles the deck, putting the cards in a random order
    //algorithm from https://www.geeksforgeeks.org/shuffle-a-given-array-using-fisher-yates-shuffle-algorithm/
    public void shuffleDeck() {
        // Creating a object for Random class
        Random r = new Random();
        // Start from the last element and swap one by one.
        for (int i = 51; i > 0; i--) {
            // Pick a random index from 0 to i
            int j = r.nextInt(i+1);
            // Swap arr[i] with the element at random index
            Card temp = deckArray[i];
            deckArray[i] = deckArray[j];
            deckArray[j] = temp;
        }
    }

    //gets the next non null card in the array and sets it to null
    public Card getNextCard() {
        Card nextCard = null;
        for(int i = 0; i < getDeckArray().length; i++) {
            if(deckArray[i] == null) {
                //do nothing
            } else {
                nextCard = deckArray[i];
                deckArray[i] = null;
                break;
            }
        }
        if(nextCard == null) {
            return null;
        } else {
            return nextCard;
        }
    }

    //used for testing purposes
     /**
        public static void main(String[] args) {
            Deck d = new Deck();
            d.createDeck();
            d.shuffleDeck();
            for (int i = 0; i < d.getDeckArray().length - 1; i++) {
                Card[] sampleDeckArray = d.getDeckArray();
                System.out.println(sampleDeckArray[i].getSuit() + " " + sampleDeckArray[i].getDenomination());
            }
        }
      **/
}
