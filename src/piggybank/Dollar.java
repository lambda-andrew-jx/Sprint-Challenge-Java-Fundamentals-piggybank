package piggybank;

public class Dollar extends Coin
{
    public Dollar(int quantity)
    {
        this.name = "Dollar";
        this.quantity = quantity;
        this.value = 1.00;
    }
}