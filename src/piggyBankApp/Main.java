package piggyBankApp;

import java.util.*;
import java.text.DecimalFormat;

public class Main {

	public static DecimalFormat fp = new DecimalFormat("$###,###.00");

	// Print coins
	public static void printCoins(List<Coin> piggyBank) {
		System.out.println("\n***Coins***");
		for (Coin coin : piggyBank) {
			System.out.println(coin);
		}
		System.out.println(""); // new line
	}

	// Pint total value
	public static void printValue(List<Coin> piggyBank) {
		double totalValue = 0;
		for (Coin coin : piggyBank) {
			totalValue += coin.getValue();
		}
		System.out.println("The piggy bank holds " + fp.format(totalValue));
	}

	public static void main(String[] args) {
		List<Coin> piggyBank = new ArrayList<Coin>();

		piggyBank.add(new Quarter());
		piggyBank.add(new Dime());
		piggyBank.add(new Dollar(5));
		piggyBank.add(new Nickel(3));
		piggyBank.add(new Dime(7));
		piggyBank.add(new Dollar());
		piggyBank.add(new Penny(10));

		printCoins(piggyBank);
		printValue(piggyBank);
	}
}