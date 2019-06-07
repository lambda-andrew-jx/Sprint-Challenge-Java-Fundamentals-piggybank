package PiggyBank;

public class Dollar extends CoinAbstract
{
    public Dollar(int amount)
    {
        super(amount);

        setName("Dollar");
        setValue(100);
    }

    public Dollar()
    {
        setName("Dollar");
        setValue(100);
    }
}