
import java.util.Random;

//Main function for the acutal game
public class Main{
    //-----------------Variables---------------------------------------
    final static public String[] suits = {"hearts", "diamonds", "spades", "clubs"};
    final static public String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
    private static Random rnd = new Random();
    static Card[] deck = new Card[52];
    static int currentCardPosition = 0;
    Player[] players = new Player[playerNumber+1];
    static int currentPlayerNumber = 0;
    
    //----------------Methods------------------------------------------
    public static void main(String[] args){
        genDeck(deck);
        shuffleDeck(deck);
        Player player1 = new Player("Horst");
        Player player2 = new Player("Heike");

    }
    //generates a new ordered deck of cards; sets the suit and rank for every card
    private static void genDeck(Card[] deck) {
        int i = 0;
        for (String s : suits) {
            for (String r : ranks) {
                deck[i] = new Card(s,r);
                i++;
            }
        }
    }
    
    //switch every card in the deck with a card on a random position
    private static void shuffleDeck(Card[] deck) {
        for (int i = 0; i < deck.length; ++i) {
            int rndPosition = rnd.nextInt(deck.length);
            Card temp = deck[i];
            deck[i] = deck[rndPosition];
            deck[rndPosition] = temp;
        }
        System.out.println("The deck of cards is now shuffled.");
    }
    
    //prints every card of the deck in current order
    private static void printCardDeck(Card[] deck) {
        System.out.println("The current ordering of the cards in the deck is: ");
        for (Card c : deck) {
            System.out.println(c);
        }
    }
    
    //next player draws the next card
    private static Card nextPlayerDrawsNextCard(){
        int cur = currentCardPosition;
        System.out.println("Player " + currentPlayerNumber +
            " draws the card " + deck[cur].getSuit + " " + deck[cur].getRank);
        currentCardPosition++;
        currentPlayerNumber++;
        return deck[cur];
    }
}