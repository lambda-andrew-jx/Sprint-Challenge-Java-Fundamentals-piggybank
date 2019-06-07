package com.company;

public class Nickel extends Money
{
    private double value = 0.05;

    public Nickel(int amount)
    {
        this.amount = amount;
    }

    public Nickel()
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
            return 1 + " Nickel";
        }
        else
        {
            return amount + " Nickels";
        }
    }
}
