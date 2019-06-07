package piggybank;

public class Dollars extends PiggyBank 
{
    private int dollars;
    
    public Dollars(int dollars)
    {
        this.dollars = dollars;
    }
    public Dollars()
    {
        this.dollars = this.dollars + 1;
    }
    public double getValue()
    {
        return dollars * 1.00;
    }

    public String getName()
    {
     String moreThanOne = dollars > 1 ? "s":"";
     return this.dollars + "Dollar" + moreThanOne;
    } 
}