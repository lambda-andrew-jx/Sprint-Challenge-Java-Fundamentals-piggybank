package piggyBankApp;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main
{
	public static void printTotal(ArrayList<AbstractCoin> bank)
	{
		DecimalFormat fp = new DecimalFormat("###,###.00");

		double total = 0;

		for (AbstractCoin c : bank)
		{
			total += c.getTotal();
		}

		System.out.println("The piggy bank has " + fp.format(total/100));
	}
	public static void main(String[] args)
	{
		ArrayList<AbstractCoin> piggybank = new ArrayList<AbstractCoin>();

		piggybank.add(new Quarter());
		piggybank.add(new Dime());
		piggybank.add(new Dollar());
		piggybank.add(new Nickel());
		piggybank.add(new Dime());
		piggybank.add(new Dollar());
		piggybank.add(new Penny());
	}
}
