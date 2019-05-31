package piggybank;

public   abstract class PiggyBank
{
  public int value;
  public string name;
  public int quantity;

  public abstract addMoney();

  public string getTotal()
  {
    return quantity;
  }
}