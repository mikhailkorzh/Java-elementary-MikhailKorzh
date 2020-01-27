package homeworks.lecture09_remastered.models.product;


public class Oil extends Product {
    private String viscosity;
    private int amount;

    public Oil(int productID, double price, String manufacturer, int totalAmount, String viscosity, int amount) {
        super(productID, price, manufacturer, totalAmount);
        this.viscosity = viscosity;
        this.amount = amount;
    }

    public String getViscosity() {
        return viscosity;
    }

    public int getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return "Oil{" +
                ", productID: " + productID +
                ", price: " + price + " USD" +
                ", amount: " + amount + " L" +
                ", viscosity: " + viscosity +
                ", manufacturer: " + manufacturer+
                ", totalAmount: " + totalAmount +
                '}';
    }
}
