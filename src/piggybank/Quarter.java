package piggybank;
public class Quarter extends AbstractMoney{
    
    public Quarter(int quantity )
    {
        super(quantity);
        value = 0.25;
        name = "Quarters";
    }
   public Quarter(){
    value = 0.25;
    name = "Quarter";
    }
    
}