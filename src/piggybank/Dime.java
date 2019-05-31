package piggybank;

public class Dime extends Coin
{
    private static String name = "Dime";
    private static double value = 0.10;

    public Dime(int quantity)
    {
        this.quantity = quantity;
    }
}