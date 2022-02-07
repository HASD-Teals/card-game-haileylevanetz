public class CardGameClient {
    public static void main(String[] args) throws Exception {
        Deck deck1= new Deck();
        Deck deck2 =new Deck();
        deck1.shuffleCards();
        deck1.shuffleCards();
        deck1.shuffleCards();
        deck1.shuffleCards();
        deck2.shuffleCards();
        deck2.shuffleCards();
        deck2.shuffleCards();
        deck2.shuffleCards();
        matches(deck1, deck2);
        
        
    }

    public static void printer (Deck smelly){
        Card[] boopy= smelly.getCards();
        for (int i=0; i<52; i++){
            System.out.print(boopy[i]);
    }
    }
    public static void matches(Deck juan, Deck two){
        int count=0;
        for(int i=0; i<juan.getLength(); i++){
            Card stinky= two.getCard(i);
            if(juan.getCard(i).compareCard(stinky)){
                count++;
                System.out.println("You have a matching pair of "+ stinky.getRank() + stinky.getSuit() + " at index " + i);
            }
        }
        if(count==0){
            System.out.println("You have no matches loser!");
        }
    }
    
}
