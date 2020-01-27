package homeworks.lecture09_remastered.models.product;

public abstract class Product {
    int productID;
    double price;
    String manufacturer;
    int totalAmount;
    //double sum;

    public Product(int productID, double price, String manufacturer, int totalAmount) {
        this.productID = productID;
        this.price = price;
        this.manufacturer = manufacturer;
        this.totalAmount = totalAmount;
    }

    public int getProductID() {
        return productID;
    }

    public double getPrice() {
        return price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public String toString() {
        return "Product{" +
                "productID=" + productID +
                ", price=" + price +
                ", manufacturer='" + manufacturer + '\'' +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
