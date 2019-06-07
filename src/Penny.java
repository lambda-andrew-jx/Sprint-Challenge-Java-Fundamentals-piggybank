public class Penny extends CurrencyUnit {

    public Penny() {
        super("Penny", "Pennies", 0.01, 1, null);
    }

    public Penny(int quantity) {
        super("Penny", "Pennies", 0.01, quantity, null);
    }
}
