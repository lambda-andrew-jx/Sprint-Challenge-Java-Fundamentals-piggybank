public class Quarter extends CurrencyUnit {

    public Quarter() {
        super("Quarter", "Quarters", 0.25, 1);
    }

    public Quarter(int quantity) {
        super("Quarter", "Quarters", 0.25, quantity);
    }
}
