package homeworks.lecture09_remastered.act;

public class Act {
    int actNumber;
    private int customerID;
    private int workerID;
    private String customerLastName;
    private String workerLastName;
    private String serviceIdentifier;
    private double totalPrice;

    public Act(int actNumber, int customerID, String customerLastName, int workerID, String workerLastName, String serviseIdentifier, double totalPrice) {
        this.customerID = customerID;
        this.workerID = workerID;
        this.serviceIdentifier = serviseIdentifier;
        this.totalPrice = totalPrice;
        this.customerLastName = customerLastName;
        this.workerLastName = workerLastName;
        this.actNumber = actNumber;
    }

    public int getCustomerID() {
        return customerID;
    }

    public int getWorkerID() {
        return workerID;
    }

    public String getServiceIdentifier() {
        return serviceIdentifier;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public String getCustomerLastName() {
        return customerLastName;
    }

    public String getWorkerLastName() {
        return workerLastName;
    }

    public int getActNumber() {
        return actNumber;
    }

    @Override
    public String toString() {
        return
                "ACT# " + actNumber +
                        "\n______________________________________\n" +
                        "\nService: \n" +
                        serviceIdentifier +
                        "\n______________________________________\n" +
                        "Customer ID \n" + customerID + "\n\n" +
                        "Customer Last Name \n" + customerLastName +
                        "\n______________________________________\n" +
                        "Worker ID \n" + workerID + "\n\n" +
                        "Worker Last Name \n" + workerLastName +
                        "\n______________________________________\n" +

                        "Total price \n" + totalPrice + "$\n\n\n";
    }
}