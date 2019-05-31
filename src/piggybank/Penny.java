package piggybank;

public class Penny extends Cash 
{
  private static String type = "Penny";
  private static double value = 0.01;

  public Penny() 
  {
    super(type, value);
  }

  public Penny(int count) 
  {
    super(type, value, count);
  }
}