package piggybank;

public class Dime extends Cash 
{
  private static String type = "Dime";
  private static double value = 0.10;

  public Dime() 
  {
    super(type, value);
  }

  public Dime(int count) 
  {
    super(type, value, count);
  }
}
