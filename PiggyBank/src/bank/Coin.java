package bank;

public class Coin
{
    private double value;
    public Coin(double value)
    {
        this.value = value;
    }
    public double getValue()
    {
        return this.value;
    }
    public int addCoins(int num, Coin c)
    {
        int added = 0;
        while (added < num)
        {
            coinList.add(c.getValue());
            added++;
        }
        return added;
    }
}