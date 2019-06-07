package piggybank;

public class Penny extends PiggyBank
{
    private int penny;

    public Penny(int penny)
    {
        this.penny = penny;
    }
    public Penny()
    {
        this.penny = this.penny + 1;
    }
    public double getValue()
    {
        return penny * 0.01;
    }

    public String getName()
    {
     String moreThanOne = penny > 1 ? "Pennies":"Penny";
     return this.penny  + moreThanOne;
    }

}