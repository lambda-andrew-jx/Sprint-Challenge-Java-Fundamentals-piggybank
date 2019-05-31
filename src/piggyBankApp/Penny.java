package piggyBankApp;

public class Penny extends Coin{
	public Penny(int quantity) {
		super("Penny", 0.01, quantity);
	}

	public Penny() {
		super("Penny", 0.01);
	}
}