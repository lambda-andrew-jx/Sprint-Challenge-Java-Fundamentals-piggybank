package piggyBankApp;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;

public class Main
{
	public static void printTotal(ArrayList<AbstractCoin> bank)
	{
		DecimalFormat fp = new DecimalFormat("###,###.00");

		double total = 0;

		for (AbstractCoin coin : bank)
		{
			total += coin.getTotal();
		}

		System.out.println("The piggy bank has " + fp.format(total/100));
	}

	public static void removeCoins(ArrayList<AbstractCoin> bank, int amount)
	{
		DecimalFormat fp = new DecimalFormat("###,###.00");

		double total = 0;

		for (AbstractCoin coin : bank)
		{
			total += coin.getTotal();
		}

		if (total > amount)
		{
			bank.sort((coin1, coin2) -> coin2.getValue() - coin1.getValue());

			for (Iterator<AbstractCoin> iterator = bank.iterator(); iterator.hasNext();)
			{
				AbstractCoin coin = iterator.next();

				if((coin.getAmount() * coin.getValue()) < amount)
				{
					amount -= (coin.getAmount() * coin.getValue());
					iterator.remove();
				}

				else if (coin.getValue() <= amount)
				{
					if (coin.getAmount() > 0)
					{
						while ((coin.getAmount() * coin.getValue()) > amount && coin.getValue() <= amount)
						{
							int startingAmount = coin.getAmount();
							coin.setAmount(startingAmount - 1);
							amount -= coin.getValue();
						}
					}
				}
			}
		}
	}
	public static void main(String[] args)
	{
		ArrayList<AbstractCoin> piggybank = new ArrayList<AbstractCoin>();

		piggybank.add(new Quarter());
		piggybank.add(new Dime());
		piggybank.add(new Dollar(5));
		piggybank.add(new Nickel(3));
		piggybank.add(new Dime(7));
		piggybank.add(new Dollar());
		piggybank.add(new Penny(10));

		System.out.println("****** Deposits ******");
		piggybank.forEach((coin) -> System.out.println(coin));

		System.out.println();

		System.out.println("****** Piggy Bank Total ******");
		printTotal(piggybank);

		System.out.println();
	}
}
