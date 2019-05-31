package piggybank;

public class Quarter extends Cash 
{
  private static String type = "Quarter";
  private static double value = 0.25;

  public Quarter() 
  {
    super(type, value);
  }

  public Quarter(int count) 
  {
    super(type, value, count);
  }
}