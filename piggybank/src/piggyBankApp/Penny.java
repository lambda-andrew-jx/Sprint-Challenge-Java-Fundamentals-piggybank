package piggyBankApp;

public class Penny extends AbstractCoin
{
	public Penny(int amount)
	{
		super(amount);

		setName("Penny");
		setValue(1);
	}

	public Penny()
	{
		setName("Penny");
		setValue(1);
	}
}
