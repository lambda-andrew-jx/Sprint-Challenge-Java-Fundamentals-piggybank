package piggyBankApp;

public abstract class Coin {
	private String name;
	private double value;
	private int quantity;

	public Coin(String name, double value, int quantity) {
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}

	public Coin(String name, double value) {
		this.name = name;
		this.value = value;
		this.quantity = 1;
	}

	public String getName() { return name; }

	public double getValue() { return value * quantity; }

	public double getQuantity() { return quantity; }

	@Override
  public String toString()
  {
    return quantity + " " + name;
  }
}