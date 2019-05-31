package piggyBank;

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
        System.out.println("The piggy bank holds " +fp.format(total));
    }

    public static void removeCoins(ArrayList<CoinAbstract> bank, double amount) {

        Collections.sort(bank, new Comparator<CoinAbstract>() {
            @Override
            public int compare(CoinAbstract c1, CoinAbstract c2) {
                return Double.compare(c2.getValue(), c1.getValue());
            }
        });

        for (Iterator<CoinAbstract> itr = bank.iterator(); itr.hasNext();) {
            CoinAbstract coin = itr.next();
            System.out.println(coin);
            if ((coin.getAmount() * coin.getValue()) < amount) {
                amount -= (coin.getAmount() * coin.getValue());
                itr.remove();
                System.out.println(amount);
            } else if (coin.getValue() <= amount) {
                if (coin.getAmount() > 0) { //avoid infinite loops hopefully
                    while ((coin.getAmount()*coin.getValue()) > amount && coin.getValue() <= amount) {
                        int initialAmount = coin.getAmount();
                        coin.setAmount(initialAmount - 1);
                        amount -= coin.getValue();
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
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
        printTotal(piggyBank);

        System.out.println("\n*** Trying to remove coins ***");
        removeCoins(piggyBank, 1.20);
        
        System.out.println("\n*** Printing Coins ***");
        piggyBank.forEach((c) -> System.out.println(c));
        System.out.println("\n*** Printing Total ***");
        printTotal(piggyBank);
    }
}