package piggybank;

import java.text.DecimalFormat;

public class Cash 
{
  static DecimalFormat fp = new DecimalFormat("$###,###.00");

  private String type;
  private double value;
  private int count;

  public Cash(String type, double value) 
  {
    this.type = type;
    this.value = value;
    count = 1;
  }

  public Cash(String type, double value, int count) 
  {
    this.type = type;
    this.value = value;
    this.count = count;
  }
  
  public String getType() 
  {
    return type;
  }

  public double getValue() 
  {
    return value;
  }

  public int getCount() 
  {
    return count;
  }

  public double getCashCount() 
  {
    return value * count;
  }

  public String getString() 
  {
    return fp.format(value * count);
  }

  @Override
  public String toString() 
  {
  return count + " " + type;
  }
}
