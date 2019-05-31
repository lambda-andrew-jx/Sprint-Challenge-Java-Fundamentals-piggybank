package piggybank;

public class Main 
{
  public static void main(String[] args) 
  {
    

    PiggyBank piggyBank = new PiggyBank();
    
    System.out.println();
    piggyBank.add(new Quarter());
    piggyBank.add(new Dime());
    piggyBank.add(new Dollar(5));
    piggyBank.add(new Nickel(3));
    piggyBank.add(new Dime(7));
    piggyBank.add(new Dollar());
    piggyBank.add(new Penny(10));
    System.out.println();
    System.out.println(piggyBank.getCash());

  }
}