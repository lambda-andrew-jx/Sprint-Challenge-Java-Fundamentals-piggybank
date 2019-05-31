package piggybank;

public class Dollar extends Coin
{
    private static String name = "Dollar";
    private static double value = 1.00;

    public Dollar(int quantity)
    {
        this.quantity = quantity;
    }
}