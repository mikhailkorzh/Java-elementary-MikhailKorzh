package lectures.fakedata;

import java.util.Random;

public class CurrencyGenerator {

    Random random = new Random();
    private Currency[] values = Currency.values();
    int size = values.length;

    public Currency generate() {
        return values[random.nextInt(size)];
    }


}
