package lectures.fakedata.enums;

public enum CreditCardType {

    VISA("4", 16),
    MASTERCARD("51", 16),
    MAESTRO("5018", 19),
    AMEX("34", 15);


    private String startsWith;
    private int length;


    CreditCardType(String startsWith, int length) {
        this.startsWith = startsWith;
        this.length = length;
    }


    public String getStartsWith() {
        return startsWith;
    }

    public int getLength() {
        return length;
    }
}
