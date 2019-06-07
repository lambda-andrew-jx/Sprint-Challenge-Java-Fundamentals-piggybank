package piggybank;

public class Nickels extends PiggyBank
{
    private int nickels;

    public Nickels(int nickels)
    {
        this.nickels = nickels;
    }
    public Nickels()
    {
        this.nickels = this.nickels + 1;
    }
    public double getValue()
    {
        return nickels * 0.05;
    }

    public String getName()
    {
     String moreThanOne = nickels > 1 ? "s":"";
     return this.nickels + "Nickel" + moreThanOne;
    }

}