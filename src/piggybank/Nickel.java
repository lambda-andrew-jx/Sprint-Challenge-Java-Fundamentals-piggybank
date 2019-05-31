package piggybank;

public class Nickel extends PiggyBank
{
   private static double defValue = 0.05;

   public Nickel(String name, int quantity)
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