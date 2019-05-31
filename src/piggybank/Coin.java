package piggybank;

import java.text.DecimalFormat;

public abstract class Coin 
{
  static DecimalFormat fp = new DecimalFormat("$###,###.00");

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

  @Override
  public String toString()
  {
      return "The piggy bank holds " + fp.format(getTotal());
  }
}