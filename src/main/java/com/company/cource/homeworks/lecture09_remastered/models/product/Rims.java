package homeworks.lecture09_remastered.models.product;

public class Rims extends Product {
    int rimWidth;
    int rimDiameter;
    String rimType;

    public Rims(int productID, double price, String manufacturer, int totalAmount, int rimWidth, int rimDiameter, String rimType) {
        super(productID, price, manufacturer, totalAmount);
        this.rimWidth = rimWidth;
        this.rimDiameter = rimDiameter;
        this.rimType = rimType;
    }

    public int getRimWidth() {
        return rimWidth;
    }

    public int getRimDiameter() {
        return rimDiameter;
    }

    public String getRimType() {
        return rimType;
    }

    @Override
    public String toString() {
        return "Rims{" +
                ", productID: " + productID +
                ", price: " + price +
                ", manufacturer: " + manufacturer + '\'' +
                ", rimWidth: " + rimWidth +
                ", rimDiameter: " + rimDiameter +
                ", rimType: " + rimType +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
