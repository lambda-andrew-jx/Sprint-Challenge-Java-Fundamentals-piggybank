package PiggyBank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<Money> money = new ArrayList<Money>();

        money.add(new Quarter());
        money.add(new Dime());
        money.add(new Dollar(5));
        money.add(new Nickel(3));
        money.add(new Dime(7));
        money.add(new Dollar());
        money.add(new Penny(10));

        money.forEach((x) -> System.out.println(x));
        System.out.println();

        double savings = 0;
        for (Money x : money)
        {
            savings += x.getTotal();
        }

        System.out.println("The piggy bank holds " +fp.format(savings));

    }
}