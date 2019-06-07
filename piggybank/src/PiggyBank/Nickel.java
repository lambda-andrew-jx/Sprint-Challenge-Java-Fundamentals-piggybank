package PiggyBank;

public class Nickel extends Money
{
    public Nickel(int quantity)
    {
        super(quantity);

        setName("Nickel");
        setValue(0.05);
    }

    public Nickel()
    {
        setName("Nickel");
        setValue(0.05);
    }

}