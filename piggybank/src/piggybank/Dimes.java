package piggybank;

public class Dimes extends PiggyBank 
{
    private int dimes;

    public Dimes(int dimes)
    {
        this.dimes = dimes;
    }
    public Dimes()
    {
        this.dimes = this.dimes + 1;
    }
    public double getValue()
    {
        return dimes * 0.10;
    }

    public String getName()
    {
     String moreThanOne = dimes > 1 ? "s":"";
     return this.dimes + "Dime" + moreThanOne;
    } 
}