package piggybank;

public class Quarter extends PiggyBank
{
   private static double defValue = 0.25;

   public Quarter(String name, int quantity)
   {
       value = defValue;

       this.name = name;
       this.quantity = quantity;
   }

   public double getTotal()
   {
       return(value * quantity);
   }

   @Override
   public String toString()
   {
       return "Yoy have $" + value;
   }
}