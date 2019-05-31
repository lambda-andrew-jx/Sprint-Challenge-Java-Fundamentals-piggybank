package piggybank;

public class Quarter extends Coin
{
    private static String name = "Quarter";

    public Quarter(int quantity)
    {
        this.quantity = quantity;
        this.value = 0.25;
    }
}