public class Card {
    // PROPERTIES
    private String color;
    private String rank;
    private String suit;
    private int value;
    private boolean playable;

    // CONSTRUCTORS
    public Card() {
        this.color = "";
        this.rank = "";
        this.suit = "";
        this.value = 0;
        this.playable = true;
    }

    // Override Constructors
    public Card(String color, String rank, String suit, int value, boolean playable) {
        this.color = color;
        this.rank = rank;
        this.suit = suit;
        this.value = value;
        this.playable = playable;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    public String getRank() {
        return this.rank;
    }

    public String getSuit() {
        return this.suit;
    }

    public int getValue() {
        return this.value;
    }

    public boolean getPlayable() {
        return this.playable;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void playable(boolean playable) {
        this.playable = playable;
    }

    // METHODS
    public String toString() {
        return (this.color + " " + this.rank + " " + this.suit + " " + this.value + " " + this.playable + "\n");
    }

    public boolean compareCard(Card stinky) {
        if (this.color.equals(stinky.getColor()) &&
                this.rank.equals(stinky.getRank()) &&
                this.suit.equals(stinky.getSuit()) &&
                this.value == stinky.getValue() &&
                this.playable == stinky.getPlayable()) {
            return true;

        }

        return false;
    }
}

// System.out.println("\u0003 This should be a Hearts suit symbol.");
// System.out.println("\u0004 This should be a Diamonds suit symbol.");
// System.out.println("\u0005 This should be a Clubs suit symbol.");
// System.out.println("\u0006 This should be a Spades suit symbol.");