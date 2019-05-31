package piggybank;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main
{
    public static void main(String[] args)
    {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        ArrayList<PiggyBank> piggyBank = new ArrayList<PiggyBank>();

        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        piggyBank.forEach((x) -> System.out.println(x));
        System.out.println();

        double savings = 0;
        for (PiggyBank x : piggyBank)
        {
            savings += x.getTotal();
        }

        System.out.println("The total of your savings are " +fp.format(savings));

    }
}