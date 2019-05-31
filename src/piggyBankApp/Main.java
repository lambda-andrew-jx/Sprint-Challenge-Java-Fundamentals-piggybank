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
			System.out.println(coin + 
				((coin.getQuantity() > 1) ? "s" : "") // More than one coin
			);
		}
		System.out.println(""); // new line
	}

	// Print total value
	public static void printValue() {
		double totalValue = 0;
		for (Coin coin : piggyBank) {
			totalValue += coin.getValue();
		}
		System.out.println("The piggy bank holds " + fp.format(totalValue) + "\n");
	}

	public static void removeCoin(Coin coin, int quantity) {
		if ( )
	}

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
	}
}