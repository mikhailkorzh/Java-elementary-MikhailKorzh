package homeworks.lecture09_remastered.models.product;

public class Tyres extends Product {
    int tyreWidth;
    int tyreProfile;
    String tyreType;

    public Tyres(int productID, double price, String manufacturer, int totalAmount, int tyreWidth, int tyreProfile, String tyreType) {
        super(productID, price, manufacturer, totalAmount);
        this.tyreWidth = tyreWidth;
        this.tyreProfile = tyreProfile;
        this.tyreType = tyreType;
    }

    public int getTyreWidth() {
        return tyreWidth;
    }

    public int getTyreProfile() {
        return tyreProfile;
    }

    public String getTyreType() {
        return tyreType;
    }

    @Override
    public String toString() {
        return "Tyres{" +
                ", productID: " + productID +
                ", price=" + price +
                ", manufacturer: " + manufacturer + '\'' +
                "tyreWidth: " + tyreWidth +
                ", tyreProfile: " + tyreProfile +
                ", tyreType: " + tyreType + '\'' +
                ", totalAmount: " + totalAmount +
                '}';
    }
}
