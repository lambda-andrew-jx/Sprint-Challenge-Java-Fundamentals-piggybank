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

}