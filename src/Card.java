public class Card {
    //Variables
    private String suit;
    private String rank;
    
    //Constructor
    public Card(String suit, String rank){
        this.suit = suit;
        this.rank = rank;
    }
    //Methods
    public String getSuit(){
        return this.suit;
    }
    public void setSuit(String suit){
        this.suit = suit;
    }
    public String getRank(){
        return this.rank;
    }
    public void setRank(String rank){
        this.rank = rank;
    }
}