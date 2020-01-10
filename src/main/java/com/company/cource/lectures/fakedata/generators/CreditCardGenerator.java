package lectures.fakedata.generators;

import lectures.fakedata.enums.CreditCardType;
import lectures.fakedata.models.CreditCart;
import lectures.fakedata.utils.RandomUtils;

public class CreditCardGenerator {

    public CreditCardType cardType = CreditCardType.values()[RandomUtils.randomNumber(CreditCardType.values().length)];
    String bin;
    int length;

    public CreditCardGenerator() {
        this.bin = cardType.getStartsWith();
        this.length = cardType.getLength();
    }

    private static void cardNumberValidatorByLuhnFormula(StringBuffer cardNumber) {

        int[] ints = new int[cardNumber.length()];
        for (int i = 0; i < cardNumber.length(); i++) {
            ints[i] = Integer.parseInt(cardNumber.substring(i, i + 1));
        }
        for (int i = ints.length - 2; i >= 0; i = i - 2) {
            int j = ints[i];
            j = j * 2;
            if (j > 9) {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            sum += ints[i];
        }
        if (sum % 10 == 0) {
            System.out.println(cardNumber + " is a valid credit card number");
        } else {
            System.out.println(cardNumber + " is an invalid credit card number");
        }
    }

    public CreditCart generate() {
        return generate(cardType);
    }

    public CreditCart generate(CreditCardType type) {
        return new CreditCart(getRandomCardNumber(), RandomUtils.calculateCurrentMonth(), RandomUtils.calculateNextYear(), RandomUtils.getRandomPerson(), cardType, getRandomCVV2());

    }

    private StringBuffer getRandomCardNumber() {
        int randomLengthWithoutBin = this.length - (this.bin.length());

        StringBuffer cardNumber = new StringBuffer(this.bin);

        for (int i = 0; i < randomLengthWithoutBin; i++) {
            int randomDigit = RandomUtils.randomNumber(9);
            cardNumber.append(randomDigit);
        }
        cardNumberValidatorByLuhnFormula(cardNumber);

        return cardNumber;
    }

    private String getRandomCVV2() {
        String cvv2 = "";
        for (int i = 0; i < 3; i++) {
            cvv2 += RandomUtils.randomNumber(9);
        }
        return cvv2;
    }

}
