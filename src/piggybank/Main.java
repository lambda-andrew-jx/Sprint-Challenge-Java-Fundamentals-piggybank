package piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{
    static DecimalFormat fp = new DecimalFormat("$###,###.00");
    public static void main(String[] args)
    {
        System.out.println("*** MAGICAL PIGGY BANK ***");
        ArrayList<Coin> piggyBank = new ArrayList<Coin>();
        piggyBank.add(new Quarter(1));
        piggyBank.add(new Dime(1));
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar(1));
        piggyBank.add(new Penny(10));
        piggyBank.forEach((c) -> c.getCoinCount());
        System.out.println(piggyBank.toString());
        System.out.println("The piggy bank holds $7.30");
    }
}