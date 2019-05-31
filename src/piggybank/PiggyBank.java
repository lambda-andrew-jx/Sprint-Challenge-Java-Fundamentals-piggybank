package piggybank;


public   abstract class PiggyBank
{
  private String name;
  private double value;  
  private int quantity;

  public PiggyBank()
  {
      this.quantity = 1;
  }

  public PiggyBank(int quantity)
  {
      this.quantity = quantity;
  }

  public double getValue()
  {
       return this.value;
  }

  public double getTotal()
  {
      return this.value * this.quantity;
  }

  public String getName()
  {
      return this.name;
  }

  public void setName(String name)
  {
      this.name = name;
  }

  public void setValue(double value)
  {
      this.value = value;
  }

  public String getQuantities()
  {
      if(this.name == "Dollar")
      {
          return "$" + this.quantity;
      }
      else if(this.quantity > 1)
      {
          if(this.name == "Penny")
          {
              return this.quantity + " Pennies";
          }
          else
          {
              return this.quantity + " " + this.name + "s";
          }
      }
      else
      {
          return this.quantity + " " + this.name;
      }
  }

  public void setQuantity(int quantity)
  {
      this.quantity = quantity;
  }

  @Override
  public String toString()
  {
      return getQuantities();
  }
  
 
}