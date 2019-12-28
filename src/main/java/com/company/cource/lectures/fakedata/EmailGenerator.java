package lectures.fakedata;

import java.util.Random;

public class EmailGenerator implements EntityGenerator {
    String RandomChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
    StringBuilder builder = new StringBuilder();
    Random random = new Random();




    @Override
    public String generate() {
        while (builder.length() < 10){
            int index = (int)(random.nextFloat()*RandomChars.length());
            builder.append(RandomChars.charAt(index));
        }
        String emailBuilder = builder.toString();
        return emailBuilder;
    }
}
