package PiggyBank;

public class Penny extends CoinAbstract
{
    public Penny(int amount)
    {
        super(amount);

        setName("Penny");
        setValue(1);
    }

    public Penny()
    {
        setName("Penny");
        setValue(1);
    }
}