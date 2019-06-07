package piggybank;

public class Nickels extends piggybank
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

    public String getName()
    {
     String moreThanOne = nickels > 1 ? "s":"";
     return this.nickels + "Nickel" + moreThanOne;
    }

}