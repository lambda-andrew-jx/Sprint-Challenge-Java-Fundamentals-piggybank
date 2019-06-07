package piggybank;

public class Quarters extends PiggyBank
{
    private int quarters;

    public Quarters(int quarters)
    {
        this.quarters = quarters;
    }
    public Quarters()
    {
        this.quarters = this.quarters + 1;
    }
    public double getValue()
    {
        return quarters * 0.25;
    }

    public String getName()
    {
     String moreThanOne = quarters > 1 ? "s":"";
     return this.quarters + "Quarter" + moreThanOne;
    }

}