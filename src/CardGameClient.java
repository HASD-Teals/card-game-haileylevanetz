public class CardGameClient {
    public static void main(String[] args) throws Exception {
        Deck deck1= new Deck();
        printer(deck1);
        deck1.shuffleCards(deck1);
        System.out.print(deck1.getLength(deck1));
        System.out.println("\n \n \n");
        printer(deck1);
        System.out.print(deck1.getLength(deck1));
        
    }

    public static void printer (Deck smelly){
        Card[] boopy= smelly.getCards();
        for (int i=0; i<52; i++){
            System.out.print(boopy[i]);
    }
    }
}
