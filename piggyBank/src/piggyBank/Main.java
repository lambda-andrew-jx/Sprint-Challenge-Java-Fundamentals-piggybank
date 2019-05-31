package piggyBank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<CoinAbstract> piggyBank = new ArrayList<CoinAbstract>();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        System.out.println("*** Printing deposits ***");
        piggyBank.forEach((c) -> System.out.println(c));

        System.out.println("\n*** Piggy Bank Total ***");
        double total = 0;
        for (CoinAbstract c : piggyBank)
        {
            total += c.getTotal();
        }
        System.out.println("The piggy bank holds " +fp.format(total));
    }
}