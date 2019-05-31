package piggybank;

public class Penny extends PiggyBank
{    
   
       public Penny(int quantity)
       {
           super(quantity);

           setName("Penny");
           setValue(0.01);
       }

       public Penny()
       {
           setName("Penny");
           setValue(0.01);
       }
   
}