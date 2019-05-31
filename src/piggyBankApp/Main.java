package piggyBankApp;

import java.util.*;

public class Main {

	public static void printCoins(List<Coin> piggyBank) {
		for (Coin coin : piggyBank) {
			System.out.println(coin);
		}
	}

	public static void printValue(List<Coin> piggyBank) {
		double totalValue = 0
		for (Coin coin : piggyBank) {
			totalValue += coin.getValue();
		}
		System.out.println(totalValue);
	}

	public static void main(String[] args) {
		List<Coin> piggyBank = new ArrayList<Coin>();

		piggyBank.add(new Dollar());
		piggyBank.add(new Dollar(3));
		piggyBank.add(new Dollar(10));

		printCoins(piggyBank);
	}
}