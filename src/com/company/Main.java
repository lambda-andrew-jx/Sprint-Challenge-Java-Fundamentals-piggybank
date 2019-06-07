package com.company;

import java.util.ArrayList;
import java.text.DecimalFormat;

public class Main {

    private static DecimalFormat fp = new DecimalFormat("$###, ###.00");
    private static double newCount;


    public static void main(String[] args)
    {
//        start arraylist
        ArrayList<Money> piggyBank = new ArrayList<>();
//        Add each instance of the money
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

// looping through each instance
        piggyBank.forEach(m -> System.out.println(m.total()));
        System.out.println();
//looping through to add the total amounts into one value
        for(Money m : piggyBank)
        {
            newCount = newCount + m.totalValue();
        }
//        printing total amount here
        System.out.println("The Piggy Bank Holds: " + fp.format(newCount));
    }
}
