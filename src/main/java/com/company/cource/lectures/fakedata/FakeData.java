package lectures.fakedata;

import lectures.fakedata.generators.CreditCardGenerator;
import lectures.fakedata.generators.ColorGenerator;
import lectures.fakedata.generators.CurrencyGenerator;
import lectures.fakedata.generators.EmailGenerator;

import java.awt.*;

public class FakeData {
        public ColorGenerator generateColors(){return new ColorGenerator();}
        public CreditCardGenerator generateCards(){return new CreditCardGenerator();}
        public CurrencyGenerator generateCurrency(){return new CurrencyGenerator();}
        public EmailGenerator generateEmail(){return new EmailGenerator();}
}
