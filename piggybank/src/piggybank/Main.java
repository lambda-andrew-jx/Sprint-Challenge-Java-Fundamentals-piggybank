package piggybank;

import java.text.DecimalFormat;
import java.util.*;

public class Main
{
public static void main(String[] args) 
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<PiggyBank> bank = new ArrayList<PiggyBank>();
        bank.add(new Quarters());
        bank.add(new Dimes());
        bank.add(new Dollars(5));
        bank.add(new Nickels(3));
        bank.add(new Dimes(7));
        bank.add(new Dollars());
        bank.add(new Penny(10));

        double money = 0;

        for(PiggyBank v:bank){
            money+=v.getValue();
        }

        bank.forEach(v -> System.out.println(v.getName()));
        System.out.println();

        System.out.println("The piggy bank holds " + fp.format(money));
        
    }
}