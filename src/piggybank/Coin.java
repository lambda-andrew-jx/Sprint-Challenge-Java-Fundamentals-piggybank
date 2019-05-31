package piggybank;

public class Coin 
{
  private String name;
  private double value;
  private int quantity;

  public Coin(String name, double value, int quantity) 
  {
    this.type = type;
    this.value = value;
    this.quantity = quantity;
  }
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