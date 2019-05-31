package piggybank;

public class Dollar extends Cash 
{
  private static String type = "Dollar";
  private static double value = 1.00;

  public Dollar() 
  {
    super(type, value);
  }

  public Dollar(int count) 
  {
    super(type, value, count);
  }
}