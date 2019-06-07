package com.company;

public class Dime extends Money
{
    private double value = 0.10;

    public Dime(int amount)
    {
        this.amount = amount;
    }

    public Dime()
    {
        this.amount = 1;
    }

    @Override
    public double totalValue()
    {
        return value * amount;
    }

    @Override
    public String total()
    {
        if(amount == 1)
        {
            return 1 + " Dime";
        }
        else
        {
            return amount + " Dimes";
        }
    }
}
