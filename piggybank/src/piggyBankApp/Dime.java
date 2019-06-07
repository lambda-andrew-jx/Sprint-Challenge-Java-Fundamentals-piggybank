package piggyBankApp;

public class Dime extends AbstractCoin
{
	public Dime(int amount)
	{
		super(amount);

		setName("Dime");
		setValue(10);
	}

	public Dime()
	{
		setName("Dime");
		setValue(10);
	}
}
