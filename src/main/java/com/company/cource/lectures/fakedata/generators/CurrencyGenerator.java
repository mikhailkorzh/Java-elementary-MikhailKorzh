package lectures.fakedata.generators;

import lectures.fakedata.enums.Currency;
import lectures.fakedata.utils.RandomUtils;

import java.util.Random;

public class CurrencyGenerator {
    public Currency generate() {
        return Currency.values()[RandomUtils.randomNumber(Currency.values().length)];
    }



}
