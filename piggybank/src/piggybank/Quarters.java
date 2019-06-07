package piggybank;

public class Quarters extends piggybank
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

    public String getName()
    {
     String moreThanOne = quarters > 1 ? "s":"";
     return this.quarters + "Quarter" + moreThanOne;
    }

}