package piggybank;

public class Dollar extends PiggyBank
{    
   
       public Dollar(int quantity)
       {
           super(quantity);

           setName("Dollar");
           setValue(1.00);
       }

       public Dollar()
       {
           setName("Dollar");
           setValue(1.00);
       }
   
}