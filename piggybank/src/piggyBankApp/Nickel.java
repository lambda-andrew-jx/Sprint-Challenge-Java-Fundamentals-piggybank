package piggyBankApp;

public class Nickel extends AbstractCoin
{
	public Nickel(int amount)
	{
		super(amount);

		setName("Nickel");
		setValue(5);
	}

	public Nickel()
	{
		setName("Nickel");
		setValue(5);
	}
}
