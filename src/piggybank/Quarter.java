package piggybank;

public class Quarter extends PiggyBank
{    
   
       public Quarter(int quantity)
       {
           super(quantity);

           setName("Quarter");
           setValue(0.25);
       }

       public Quarter()
       {
           setName("Quarter");
           setValue(0.25);
       }
   
}