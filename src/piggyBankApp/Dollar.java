package piggyBankApp;

public class Dollar extends Coin{
	public Dollar(int quantity) {
		super("Dollar", 1.00, quantity);
	}

	public Dollar() {
		super("Dollar", 1.00);
	}
}