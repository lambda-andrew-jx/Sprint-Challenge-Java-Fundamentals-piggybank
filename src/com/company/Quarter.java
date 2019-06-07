package com.company;

public class Quarter extends Money
{
    private double value = 0.25;

    public Quarter(int amount)
    {
        this.amount = amount;
    }

    public Quarter()
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
            return 1 + " Quarter";
        }
        else
        {
            return amount + " Quarters";
        }
    }
}
