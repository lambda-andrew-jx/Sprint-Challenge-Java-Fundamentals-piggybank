package piggyBankApp;

public class Quarter extends AbstractCoin
{
	public Quarter(int amount)
	{
		super(amount);

		setName("Quarter");
		setValue(25);
	}

	public Quarter()
	{
		setName("Quarter");
		setValue(25);
	}
}
