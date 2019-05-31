package piggybank;

public class Quarter extends Coin
{
    private static String name = "Quarter";
    private static double value = 0.25;

    public Quarter(int quantity)
    {
        this.quantity = quantity;
    }
}