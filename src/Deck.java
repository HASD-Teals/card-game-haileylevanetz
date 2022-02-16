import java.util.*;

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
            counter= 1;
            for(int i=27; i<40; i++){
                    
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
                Card temp= new Card("black", rank, "\u0005", i, true);
                temp.setValue(i-26);
                cards[i-1]=temp;
                counter++;
                
        }
        counter= 1;
        for(int i=40; i<53; i++){
                
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
            Card temp= new Card("black", rank, "\u0006", i, true);
            temp.setValue(i-39);
            cards[i-1]=temp;
            counter++;
            
    }
}

    // ACCESSORS
    public Card[] getCards() {
        return this.cards;
    }
    public Card getCard (int n){
        return this.cards[n];
    }
    public int getLength(){
        return this.cards.length;
    }

    // MUTATORS
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    // METHODS
    public void shuffleCards() {
        Card[] smelly = this.cards;
        Card temp= new Card();
        for (int i = 0; i <smelly.length; i++) {
            int j = (int)(Math.random() * smelly.length);
            temp=smelly[j];
            smelly[j] = smelly[i];
            smelly[i]= temp;
        }
    }
    public String drawCard (){
        int j = (int)(Math.random() * this.cards.getLength());
     Card draw= this.cards.getCard(j);
     String bean= (""+ draw.getRank() + draw.getSuit());
     return bean;
    }
    

}

// Card[] smelly = this.cards;
// Card[] temp = new Card[52];
// for (int i = 0; i <smelly.length; i++) {
//     int j = (int)(Math.random() * smelly.length); 
//     temp[i] = smelly[j];
// }
// this.cards = temp;