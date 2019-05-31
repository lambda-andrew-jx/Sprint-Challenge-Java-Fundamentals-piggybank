package piggybank;

public class Nickel extends PiggyBank
{    
   
       public Nickel(int quantity)
       {
           super(quantity);

           setName("Nickel");
           setValue(0.05);
       }

       public Nickel()
       {
           setName("Nickel");
           setValue(0.05);
       }
   
}