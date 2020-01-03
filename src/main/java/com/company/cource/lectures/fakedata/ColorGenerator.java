package lectures.fakedata;

import java.awt.*;
import java.util.Random;

public class ColorGenerator {
    public String generate() {
        Random random = new Random();

        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);

        Color color = new Color(r, g, b);

        String hexadecimal = Integer.toHexString(color.getRGB() & 0xffffff);

        if (hexadecimal.length() < 6) {
            hexadecimal = "0" + hexadecimal;
        }
        hexadecimal = "#" + hexadecimal;

        return hexadecimal;
    }

}
