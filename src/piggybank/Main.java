package piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {
    public static void handlePiggyBank() {
        DecimalFormat fp = new DecimalFormat("$###,###.00");
        // Quarter quarter = new Quarter();
        // System.out.println(quarter.getValue());
        // System.out.println("The piggy bank holds " + fp.format(myValue));
      
      
        ArrayList<AbstractMoney> piggyBank = new ArrayList<AbstractMoney>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add( new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add( new Dollar());
        piggyBank.add(new Penny(10));
       
        System.out.println("\n*** Display Contents *** \n");
        piggyBank.forEach((c)-> c.getCoin());
        System.out.println();
        double total = 0;
        for (int i = 0; i < piggyBank.size(); i++) {
            total += piggyBank.get(i).getValue();
        }

        System.out.println("*** Total ***\n");
        System.out.println("The piggy bank holds " + fp.format(total));


    }

    public static void main(String[] args) {
        handlePiggyBank();

    }
}