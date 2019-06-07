package piggybank;

public class Dimes extends PiggyBank 
{
    private int Dimes(int dimes)
    {
        this.dimes =dimes;
    }
    public Dimes()
    {
        this.quarters = this.quarters + 1;
    }

    public String getName()
    {
     String moreThanOne = dimes > 1 ? "s":"";
     return this.dimes + "Dime" + moreThanOne;
    }
}