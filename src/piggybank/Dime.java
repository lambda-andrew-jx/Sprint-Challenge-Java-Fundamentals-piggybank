package piggybank;

public class Dime extends PiggyBank
{    
   
       public Dime(int quantity)
       {
           super(quantity);

           setName("Dime");
           setValue(0.10);
       }

       public Dime()
       {
           setName("Dime");
           setValue(0.10);
       }
   
}