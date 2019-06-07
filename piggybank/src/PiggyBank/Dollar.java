package PiggyBank;

public class Dollar extends Money
{
    public Dollar(int quantity)
    {
        super(quantity);

        setName("Dollar");
        setValue(1.00);
    }

    public Dollar()
    {
        setName("Dollar");
        setValue(1.00);
    }

}