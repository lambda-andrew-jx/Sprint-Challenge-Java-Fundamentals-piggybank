package piggybank;

public class Dollar extends Coin
{
    private static String name = "Dollar";

    public Dollar(int quantity)
    {
        this.quantity = quantity;
        this.value = 1.00;
    }
}