package PiggyBank;

public class Nickel extends CoinAbstract
{
    public Nickel(int amount)
    {
        super(amount);

        setName("Nickel");
        setValue(5);
    }

    public Nickel()
    {
        setName("Nickel");
        setValue(5);
    }
}