package lectures.fakedata.models;

import lectures.fakedata.enums.CreditCardType;

public class CreditCart {
    private StringBuffer cardNumber;
    private int expireMonth;
    private int expireYear;
    private String owner;
    private CreditCardType type;
    private String securityCode;

    public CreditCart(StringBuffer cardNumber, int expireMonth, int expireYear, String owner, CreditCardType type, String securityCode) {
        this.cardNumber = cardNumber;
        this.expireMonth = expireMonth;
        this.expireYear = expireYear;
        this.owner = owner;
        this.type = type;
        this.securityCode = securityCode;
    }

    public StringBuffer getCardNumber() {
        return cardNumber;
    }

    public int getExpireMonth() {
        return expireMonth;
    }

    public int getExpireYear() {
        return expireYear;
    }

    public String getOwner() {
        return owner;
    }

    public CreditCardType getType() {
        return type;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    @Override
    public String toString() {
        return "CREDIT CART NUMBER: " + cardNumber +
                ", EXPIRATION MONTH: " + expireMonth +
                ", EXPIRATION YEAR: " + expireYear +
                ", OWNER INITIALS: " + owner +
                ", CART TYPE: " + type +
                ", CVV2: " + securityCode;
    }
}
