package piggyBankApp;

public abstract class AbstractCoin
{
	private String name;
	private int value;
	private int amount;

	public AbstractCoin()
	{
		this.amount = 1;
	}

	public AbstractCoin(int amount)
	{
		this.amount = amount;
	}

	public int getTotal()
	{
		return this.value * this.amount;
	}

	public String getName()
	{
		return this.name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getValue()
	{
		return this.value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public int getAmount()
	{
		return this.amount;
	}

	public void setAmount(int amount)
	{
		this.amount = amount;
	}

	@Override
	public String toString()
	{
		if (this.name == "Dollar") {
			return "$" + this.amount;
		}
		else if (this.amount > 1 )
		{
			if (this.name == "Penny")
			{
				return this.amount + " Pennies";
			}
			else
			{
				return this.amount + " " + this.name + "s";
			}
		}
		else
		{
			return this.amount + " " + this.name;
		}
	}
}
