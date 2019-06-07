package com.company;

public class Dollar extends Money
{
    private double value = 1.00;

    public Dollar(int amount)
    {
        this.amount = amount;
    }

    public Dollar()
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
            return "$" + 1;
        }
        else
        {
            return "$" + amount;
        }
    }
}
