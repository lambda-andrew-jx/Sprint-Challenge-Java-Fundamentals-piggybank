package piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class main
{
public static void main(String[] args) 
    {
        ArrayList<PiggyBank> bank = new ArrayList<PiggyBank>();
        bank.add(new Quarters());
        bank.add(new Dimes());
        bank.add(new Dollars(5));
        bank.add(new Nickels(3));
        bank.add(new Dimes(7));
        bank.add(new Dollars());
        bank.add(new Penny(10));
        
    }
}