package piggyBankApp;

import java.util.*;
import java.text.DecimalFormat;

public class Main {

	private static List<Coin> piggyBank;
	public static final DecimalFormat fp = new DecimalFormat("$###,###.00");

	// Print coins
	public static void printCoins() {
		System.out.println("\n***Coins***");
		for (Coin coin : piggyBank) {
			System.out.println(coin);
		}
		System.out.println(""); // new line
	}// printCoins

	// Print total value
	public static void printValue() {
		double totalValue = 0;
		for (Coin coin : piggyBank) {
			totalValue += coin.getTotalValue();
		}
		System.out.println("The piggy bank holds " + fp.format(totalValue) + "\n");
	}// printValue

	// Remove Coin
	public static void removeCoin(Coin coin, int quantity) {
    System.out.println("***Remove Coins***");

		int coinsInPB = 0;
		for (Coin piggyCoin : piggyBank) {
      if (piggyCoin.getName().equals(coin.getName())) {
        coinsInPB += piggyCoin.getQuantity();
      }
    }

    if(coinsInPB >= quantity) {
    	int i = 0;
			for (Coin piggyCoin : piggyBank) {
	    	if (piggyCoin.getName().equals(coin.getName())) {
	    		piggyBank.set(i, new Coin(coin.getName(), coin.getValue(), 0));
	    		// piggyBank.remove(i);
	    	} 
	    	i++;
	    }

    	int coinsLeft = (coinsInPB - quantity);
	    if (coinsLeft != 0) piggyBank.add(new Coin(coin.getName(), coin.getValue(), coinsLeft));

    	System.out.println(quantity + " " + coin.getName() + "s removed");
    	printValue();
    } else {
    	System.out.println("There are only " + coinsInPB + " " + coin.getName() + "s in the piggy bank.");
    }
	}// removeCoin

	public static void main(String[] args) {
		piggyBank = new ArrayList<Coin>();

		piggyBank.add(new Quarter());
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(5));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Dime(7));
		piggyBank.add(new Dollar());
		piggyBank.add(new Penny(10));

		printCoins();
		printValue();
		removeCoin(new Dime(), 2);
		printCoins();
	}
}