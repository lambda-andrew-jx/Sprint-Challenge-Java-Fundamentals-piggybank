package com.company;

public class Penny extends Money
{
    private double value = 0.01;

    public Penny(int amount)
    {
        this.amount = amount;
    }

    public Penny()
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
            return 1 + " Penny";
        }
        else
        {
            return amount + " Pennies";
        }
    }
}
