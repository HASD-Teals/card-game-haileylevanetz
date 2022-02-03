public class Deck {
    // PROPERTIES
    private Card[] cards;

    // CONSTRUCTORS
    public Deck() {
            this.cards= new Card[52];
            int counter=0;
            String rank="";
            for(int i=1; i<14; i++){
                if(i==1){
                    rank="A";
                }
                if(i==11){
                    rank="J";
                }
                if(i==12){
                    rank="Q";
                }
                if(i==13){
                    rank="K";
                }
                //else{
                    //rank= ""+i;
               // }
                Card temp= new Card("red", rank, "\u0003", i, true);
                if(i>10){
                    //temp[i].setValue()=10;
                }
                cards[counter]=temp;
                counter++;
               
            }
    }

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        // Shuffle this.cards in a random order
    }
}
