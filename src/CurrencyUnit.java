public abstract class CurrencyUnit {

    private String name;
    private String pluralName;
    private double value;
    private int quantity;

    public CurrencyUnit(String name, String pluralName, double value, int quantity, String alternativeCreationString) {
        this.name = name;
        this.pluralName = pluralName;
        this.value = value;
        this.quantity = quantity;

        if (alternativeCreationString != null) {
            System.out.println(alternativeCreationString);
        } else {
            System.out.println(this.quantity + " " + (this.quantity > 1 ? this.pluralName : this.name));
        }
    }

    public double getTotalValue() {
        return this.value * this.quantity;
    }

}