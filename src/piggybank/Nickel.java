package piggybank;

public class Nickel extends Cash 
{
  private static String type = "Nickel";
  private static double value = 0.05;

  public Nickel() 
  {
    super(type, value);
  }

  public Nickel(int count) 
  {
    super(type, value, count);
  }
}