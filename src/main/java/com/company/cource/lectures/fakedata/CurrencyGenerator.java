package lectures.fakedata;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CurrencyGenerator implements EntityGenerator{

    private Currency[] values = Currency.values();
    int size = values.length;
    Random random = new Random();



    @Override
    public Currency generate() {
        return values[random.nextInt(size)];
    }



}
