package com.company;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat fp = new DecimalFormat("$###, ###.00");
    private static double newCount;


    public static void main(String[] args)
    {
        ArrayList<Money> piggyBank = new ArrayList<>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));


        piggyBank.forEach(m -> System.out.println(m.total()));

        for(Money m : piggyBank)
        {
            newCount = newCount + m.totalValue();
        }
        System.out.println("The Piggy Bank Holds: " + fp.format(newCount));
    }
}
