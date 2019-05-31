package piggybank;

public abstract class Coin 
{
  private String name;
  private double value;
  int quantity;

  public String getName()
  {
      return this.name;
  }
  public int getQuantity()
  {
      return this.quantity;
  }
  public double getValue()
  {
      return this.value;
  }
  public double getTotal() 
  {
      return this.value * this.quantity;
  }
}