package piggyBankApp;

public class Dollar extends AbstractCoin
{
	public Dollar(int amount)
	{
		super(amount);

		setName("Dollar");
		setValue(100);
	}

	public Dollar()
	{
		setName("Dollar");
		setValue(100);
	}
}
