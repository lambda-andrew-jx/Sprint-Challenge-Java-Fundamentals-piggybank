package piggyBankApp;

public class Quarter extends Coin{
	public Quarter(int quantity) {
		super("Quarter", 0.25, quantity);
	}

	public Quarter() {
		super("Quarter", 0.25);
	}
}