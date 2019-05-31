package piggybank;

public class Dime extends Coin
{
    private static String name = "Dime";

    public Dime(int quantity)
    {
        this.quantity = quantity;
        this.value = 0.10;
    }
}