package PiggyBank;
import java.util.*;

public abstract class Money
{

    private String name;
    private double value;
    private int amountStored;
    private int originalDeposit;

    public void setValues(String name, double value, int amountStored, int originalDeposit)
    {
        this.name = name;
        this.value = value;
        this.amountStored = amountStored;
        this.originalDeposit = originalDeposit;
    }

    public double tally()
    {
        return this.value * this.amountStored;
    };

    public int getAmountStored()
    {
        return amountStored;
    }

    public void setAmountStored(int amountStored)
    {
        this.amountStored = amountStored;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        if (amountStored > 1)
        {
            return "\n" + amountStored + " " + name + "'s";
        } else {
            return "\n" + amountStored + " " + name;
        }
    }
}