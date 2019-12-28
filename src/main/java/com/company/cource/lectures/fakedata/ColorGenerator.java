package lectures.fakedata;

import java.awt.*;
import java.util.Random;

public class ColorGenerator implements EntityGenerator {
    private Random random = new Random();

    float r = random.nextFloat();
    float g = random.nextFloat();
    float b = random.nextFloat();

    public ColorGenerator(float r, float g, float b) {
        this.r = r;
        this.g = g;
        this.b = b;
    }

    private Color randomEntity = new Color(r,g,b);


    @Override
    public Color generate() {
        return randomEntity;
    }
}
