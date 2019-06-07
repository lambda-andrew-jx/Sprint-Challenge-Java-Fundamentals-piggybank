package PiggyBank;

public class Dime extends CoinAbstract
{
    public Dime (int amaount)
    {
        super(amount);

        setName("Dime");
        setValue(10);

    }

    public Dime()
    {
        setName("Dime");
        setValue(10);
    }
}