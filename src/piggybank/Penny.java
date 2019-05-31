package piggybank;

public class Penny extends Coin
{
    private static String name = "Penny";

    public Penny(int quantity)
    {
        this.quantity = quantity;
        this.value = 0.01;
    }


}
