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
        piggyBank.add(new Quarter(2));
        // ArrayList<Coin> piggyBankArrayList = new ArrayList<Coin>();
        // piggyBankArrayList.add(new Quarter(1));
        System.out.println(piggyBank);
    }
}