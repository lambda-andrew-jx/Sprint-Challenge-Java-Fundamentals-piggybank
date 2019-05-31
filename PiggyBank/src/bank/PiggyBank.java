package bank;

import java.util.ArrayList;

public class PiggyBank
{
    private ArrayList<Coin> coinList = new ArrayList<>();

    public int getNumOfCoins()
    {
        return coinList.size();
    }

    public double getMoney()
    {
        double sum = 0;
        for (Coin c : coinList)
        {
            sum = sum + c.getValue();
        }
        return sum;
    }
}

