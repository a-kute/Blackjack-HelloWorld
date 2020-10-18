package main;

public class Game {

    Deck deck  = new Deck();
    public Player player = new Player(600);
    public Dealer dealer = new Dealer();
    public Card nextCard;

    public int getBank() {
        return player.getBank();
    }

    public void startGame(){
        deck.createDeck();
        deck.shuffleDeck();
        player.clearHand();
        dealer.clearHand();
        player.addToHand(drawCard());
        player.addToHand(drawCard());
        dealer.addToHand(drawCard());
        dealer.addToHand(drawCard());



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

    public Card drawCard(){
        Card nextCard = deck.getNextCard();
        this.nextCard = nextCard;
        return nextCard;
    }


    //returns -1 if player total has exceeded 21
    // returns 0 to continue
    //returns 1 that player has won
    public int hitPlayer() {
        checkDeck();

        player.addToHand(this.nextCard);

        if (player.getScore() > 21){
            if(player.getAceCount()>=1){
                player.setAceCount(player.getAceCount()-1);
                player.setScore(player.getScore()-10);
            } else {
                player.loss();
                return -1;
            }
        }

        if (player.getScore()== 21){
            player.win();
            return 1;
        }

        return 0;
    }

    //returns -1 if player total has exceeded 21
    // returns 0 to continue
    //returns 1 that player has won
    public int hitDealer() {
        checkDeck();

        dealer.addToHand(this.nextCard);

        if (dealer.getScore() > 21){
            if(dealer.getAceCount()>=1){
                dealer.setAceCount(dealer.getAceCount()-1);
                dealer.setScore(dealer.getScore()-10);
            } else {
                player.loss();
                return -1;
            }
        }

        if (dealer.getScore()== 21){
            player.win();
            return 1;
        }

        return 0;
    }








}
