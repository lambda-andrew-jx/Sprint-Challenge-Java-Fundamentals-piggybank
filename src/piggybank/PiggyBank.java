package piggybank;

import java.text.DecimalFormat;
import java.util.HashMap;

public class PiggyBank 
{
  static DecimalFormat fp = new DecimalFormat("$###,###.00");
  private HashMap<String, Integer> cash = new HashMap<>();

  private double total = 0;

  public void add(Cash amount) 
  {
    String type = amount.getType();

    if (!cash.containsKey(type)) 
    {
      cash.put(type, 0);
    }
    
    cash.put(type, cash.get(type) + amount.getCount());
    total += amount.getCashCount();

    System.out.println(amount.toString());
  }
  public String getCash() 
  {
    return "My piggy bank has " + fp.format(total);
  }
}
