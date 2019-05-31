package bank;

public class Coin
{
    private  int num;
    private String name;
    private double value;
    public Coin(double value, int num, String name)
    {
        this.name = name;
        this.num = num;
        this.value = value;
    }
    public double getValue()
    {
        return this.value * num;
    }
    public String getName()
    {
        return this.name;
    }
    // public int addCoins(int num, Coin c)
    // {
    //     this.num = num;
    //     int added = 0;
    //     while (added < num)
    //     {
    //         coinList.add(c.getValue());
    //         added++;
    //     }
    //     return added;
    // }
    public int getNum()
    {
        return num;
    }
}