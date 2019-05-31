package piggyBankApp;

public class Nickel extends Coin{
	public Nickel(int quantity) {
		super("Nickel", 0.05, quantity);
	}

	public Nickel() {
		super("Nickel", 0.05);
	}
}