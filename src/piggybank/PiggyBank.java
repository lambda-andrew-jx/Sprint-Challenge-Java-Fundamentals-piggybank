package piggybank;

public   abstract class PiggyBank
{
  public double value;
  public String name;
  public int quantity;

  public abstract addMoney();

  public double getTotal()
  {
    return value;
  }
}