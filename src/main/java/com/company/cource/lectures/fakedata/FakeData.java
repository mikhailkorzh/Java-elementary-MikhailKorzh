package lectures.fakedata;

import java.util.Calendar;

public class FakeData {
    public static void main(String[] args) {
        ColorGenerator colorGenerator = new ColorGenerator();
        System.out.println(colorGenerator.generate());

        CurrencyGenerator currencyGenerator = new CurrencyGenerator();
        System.out.println(currencyGenerator.generate());

        CreditCardGenerator creditCardGenerator = new CreditCardGenerator("34",15);
        System.out.println(creditCardGenerator.generate());

        EmailGenerator emailGenerator = new EmailGenerator();
        System.out.println(emailGenerator.generate());


        //.........to be continued



    }





}
