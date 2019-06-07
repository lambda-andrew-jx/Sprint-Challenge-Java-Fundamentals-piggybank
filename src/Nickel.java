public class Nickel extends CurrencyUnit {

    public Nickel() {
        super("Nickel", "Nickels", 0.05, 1);
    }

    public Nickel(int quantity) {
        super("Nickel", "Nickels", 0.05, quantity);
    }
}
