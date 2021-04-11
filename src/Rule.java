public class Rule{
    //----------------------Variables--------------------------------------------
    //indicates if sips can be distributed or are for the drawing player
    boolean forSelf;
    //sets the amount of sips have to be drunk this round
    int amount;
    
    //Constructor
    public Rule(){
    }
    
    //----------------------------Methods-----------------------------------------
    public boolean getForSelf(){
        return this.forSelf;
    }
    public void setForSelf(boolean target){
        this.forSelf = target;
    }
    public int getAmount(){
        return this.amount;
    }
    public void setAmount(int newAmount){
        this.amount = newAmount;
    }
}