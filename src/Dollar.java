public class Dollar extends CurrencyUnit {

    // Default constructor with quantity = 1.
    public Dollar() {
        super("Dollar", "Dollars", 1.00, 1, "$1");
    }

    public Dollar(int quantity) {
        super("Dollar", "Dollars", 1.00, quantity, "$" + quantity);
    }
}