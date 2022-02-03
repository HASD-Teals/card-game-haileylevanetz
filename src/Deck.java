public class Deck {
    // PROPERTIES
    private Card[] cards;

    // CONSTRUCTORS
    public Deck() {
            this.cards= new Card[52];
            int counter=1;
            String rank="";
            for(int i=1; i<14; i++){
                if(counter >= 2 && counter < 11) {
                    rank = ""+counter;
                }
                if(counter==1){
                    rank="A";
                }
                if(counter==11){
                    rank="J";
                }
                if(counter==12){
                    rank="Q";
                }
                if(counter==13){
                    rank="K";
                }
                Card temp= new Card("red", rank, "\u0003", i, true);
                if(counter>10){
                    //temp[i].setValue()=10;
                }
                cards[i-1]=temp;
                counter++;
               
            }
            counter=1;
            for(int i=14; i<27; i++){
            
                if(counter==1){
                   rank="A";
                }
                if(counter>=2 && counter<11){
                    rank= ""+ counter;
                }
                if(counter==11){
                    rank="J";
                }
                if(counter==12){
                    rank="Q";
                }
                if(counter==13){
                    rank="K";
                }
                Card temp= new Card("red", rank, "\u0004", i, true);
                temp.setValue(i-13);
                cards[i-1]=temp;
                counter++;
                   
    }
            for(int i=14; i<27; i++){
                    
                if(counter==1){
                rank="A";
                }
                if(counter>=2 && counter<11){
                    rank= ""+ counter;
                }
                if(counter==11){
                    rank="J";
                }
                if(counter==12){
                    rank="Q";
                }
                if(counter==13){
                    rank="K";
                }
                Card temp= new Card("red", rank, "\u0004", i, true);
                temp.setValue(i-13);
                cards[i-1]=temp;
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
