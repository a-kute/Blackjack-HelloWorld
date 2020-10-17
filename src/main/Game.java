package main;

public class Game {

    Deck deck  = new Deck();
    public Player player = new Player(600);
    public Dealer dealer = new Dealer();

    public int getBank() {
        return player.getBank();
    }

    public void startGame(){
        deck.createDeck();
        deck.shuffleDeck();
        player.clearHand();
        dealer.clearHand();

    }

    public void startRound(){
        checkDeck();
        player.clearHand();
        dealer.clearHand();

    }

    public void checkDeck(){
        if (deck.getNumberOfAvailableCards() == 0)
            deck.createDeck();
            deck.shuffleDeck();

    }

    public void placeBet(int amount){
        switch(amount) {
            case 10 : player.add10();
            break;
            case 50 : player.add50();
            break;
            case 100: player.add100();
            break;
            case 500: player.add500();
            break;
        }
    }


    //returns -1 if player total has exceeded 21
    // returns 0 to continue
    //returns 1 that player has won
    public int hitPlayer() {
        checkDeck();
        Card nextCard = deck.getNextCard();
        player.addToHand(nextCard);

        if (player.getScore() > 21){
            if(player.getAceCount()>=1){
                player.setAceCount(player.getAceCount()-1);
                player.setScore(player.getScore()-10);
            } else {
                return -1;
            }
        }

        if (player.getScore()== 21){
            return 1;
        }

        return 0;
    }

    //returns -1 if player total has exceeded 21
    // returns 0 to continue
    //returns 1 that player has won
    public int hitDealer() {
        checkDeck();
        Card nextCard = deck.getNextCard();
        dealer.addToHand(nextCard);

        if (dealer.getScore() > 21){
            if(dealer.getAceCount()>=1){
                dealer.setAceCount(dealer.getAceCount()-1);
                dealer.setScore(dealer.getScore()-10);
            } else {
                return -1;
            }
        }

        if (dealer.getScore()== 21){
            return 1;
        }

        return 0;
    }








}
