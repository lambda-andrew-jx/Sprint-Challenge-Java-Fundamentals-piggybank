package piggyBankApp;

public class Dime extends Coin{
	public Dime(int quantity) {
		super("Dime", 0.10, quantity);
	}

	public Dime() {
		super("Dime", 0.10);
	}
}