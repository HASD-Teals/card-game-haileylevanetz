public class CardGameClient {
    public static void main(String[] args) throws Exception {
        Deck deck1= new Deck();
        printer(deck1);
    }
    public static void printer (Deck smelly){
        Card[] boopy= smelly.getCards();
        for (int i=0; i<52; i++){
            System.out.print(boopy[i]);
    }
    }
}
