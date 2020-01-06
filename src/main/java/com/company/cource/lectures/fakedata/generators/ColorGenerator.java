package lectures.fakedata.generators;

import lectures.fakedata.utils.RandomUtils;

import java.awt.*;
import java.util.Random;

public class ColorGenerator {
    public Color generate() {

        return new Color(
                RandomUtils.randomNumber(255),
                RandomUtils.randomNumber(255),
                RandomUtils.randomNumber(255)
        );

        /*String hexadecimal = Integer.toHexString(color.getRGB() & 0xffffff);

        if (hexadecimal.length() < 6) {
            hexadecimal = "0" + hexadecimal;
        }
        hexadecimal = "#" + hexadecimal;

        return hexadecimal;*/
    }

}
