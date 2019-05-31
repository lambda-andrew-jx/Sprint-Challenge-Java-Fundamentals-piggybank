package piggybank;

public class Dollar extends PiggyBank
{
   private static double defValue = 1.0;

   public Dollar(String name, int quantity)
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