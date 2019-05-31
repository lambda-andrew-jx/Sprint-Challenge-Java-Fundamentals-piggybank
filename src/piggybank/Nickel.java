package piggybank;

public class Nickel extends Coin
{
    private static String name = "Nickel";

    public Nickel(int quantity)
    {
        this.quantity = quantity;
        this.value = 0.05;
    }
}