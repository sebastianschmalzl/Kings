public class Player {
    //Variables
    private String name;
    public int playerNumber = 0;
    Player[] playerList = new Player[playerNumber];
    
    //Constructor
    public Player(String newName){
        this.name = newName;
        System.out.println("New player " + this.name + " has been created.");
        playerList[playerNumber] = this;
        playerNumber++;
    }
    
    //Methods
    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }
    public int getNumber(){
        return this.playerNumber;
    }
    public void setNumber(int newNumber){
        this.playerNumber = newNumber;
    }
}