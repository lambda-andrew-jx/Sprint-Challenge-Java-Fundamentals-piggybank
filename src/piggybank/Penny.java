package piggybank;

public class Penny extends Coin
{
    private static String name = "Penny";
    private static double value = 0.01;

    public Penny(int quantity)
    {
        this.quantity = quantity;
    }


}
