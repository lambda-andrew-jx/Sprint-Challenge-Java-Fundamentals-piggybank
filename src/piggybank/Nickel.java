package piggybank;

public class Nickel extends Coin
{
    private static String name = "Nickel";
    private static double value = 0.05;

    public Nickel(int quantity)
    {
        this.quantity = quantity;
    }
}