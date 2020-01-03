package lectures.fakedata;

import java.util.Random;

public class CreditCardGenerator{
    String bin;
    int length;

    public CreditCardGenerator(String bin, int length) {
        this.bin = bin;
        this.length = length;
    }

    private Random random = new Random();

    public StringBuilder generate() {
        int randomLengthWithoutBin = this.length - (this.bin.length());

        StringBuilder builder = new StringBuilder(this.bin);

        for (int i = 0; i < randomLengthWithoutBin; i++) {
            int randomDigit = random.nextInt(9);
            builder.append(randomDigit);
        }

        return builder;
    }
}
