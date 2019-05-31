package piggybank;

public class Penny extends PiggyBank
{
   private static double defValue = 0.01;

   public Penny(String name, int quantity)
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