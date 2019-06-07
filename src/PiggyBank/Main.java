package PiggyBank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.text.DecimalFormat;
import java.util.Iterator;

public class Main
{
    public static void printTotal(ArrayList<CoinAbstract> bank) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        double total = 0;

        for (CoinAbstract c : bank)
        {
            total += c.getTotal();
        }
        System.out.println("The Piggy Bank holds " +fp.format(total/100));
    }

    public static void removeCoins(ArrayList<CoinAbstract> bank, int amount) {
        DecimalFormat fp = new DecimalFormat("$###,###.00");

        double total = 0;

        for (CoinAbstract c : bank)
        {
            total += c.getTotal();
        }

        if (amount > total) {
            System.out.println("\nYou're trying to money\n");
            System.out.println("The Piggy Bank holds " +fp.format(total/100));

        } else {
            bank.sort((c1, c2) -> c2.getValue() - c1.getValue());

            for (Iterator<CoinAbstract> itr = bank.iterator(); itr.hasNext();) {
                CoinAbstract coin = itr.next();
                // System.out.println(coin);

                if ((coin.getAmount() * coin.getValue()) < amount) {
                    amount -= (coin.getAmount() * coin.getValue());
                    itr.remove();

                    // System.out.println(amount);

                } else if (coin.getValue() <= amount) {

                    if (coin.getAmount() > 0) {

                        while ((coin.getAmount()*coin.getValue()) > amount && coin.getValue() <= amount) {
                            int initialAmount = coin.getAmount();
                            coin.setAmount(initialAmount - 1);
                            amount -= coin.getValue();
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<CoinAbstract> PiggyBank = new ArrayList<CoinAbstract>();

        PiggyBank.add(new Quarter());
        PiggyBank.add(new Dime());
        PiggyBank.add(new Dollar(5));
        PiggyBank.add(new Nickel(3));
        PiggyBank.add(new Dime(7));
        PiggyBank.add(new Dollar());
        PiggyBank.add(new Penny(10));

        System.out.println("*** Printing deposits ***");
        PiggyBank.forEach((c) -> System.out.println(c));

        System.out.println("\n*** Piggy Bank Total ***");
        printTotal(PiggyBank);

        System.out.println("\n*** Trying to remove coins ***");
        removeCoins(PiggyBank, 164);

        System.out.println("\n*** Printing Coins ***");
        PiggyBank.forEach((c) -> System.out.println(c));
        System.out.println("\n*** Printing Total ***");
        printTotal(PiggyBank);
    }
}