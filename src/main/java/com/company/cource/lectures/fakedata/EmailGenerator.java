package lectures.fakedata;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class EmailGenerator {
    Random random = new Random();
    int randomPosition = random.nextInt(2);
    int randomNumber = random.nextInt(99);
    int randomYear = randBetween(1900, calculateCurrentYear());
    private FirstName[] firstNames = FirstName.values();
    private LastName[] lastNames = LastName.values();
    private RootDomain[] rootDomains = RootDomain.values();
    private String builder;

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public int calculateCurrentYear() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(new Date());
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear;
    }

    public String generate() {
        switch (randomPosition) {
            case 0:
                builder = lastNames[random.nextInt(lastNames.length)] + "." + firstNames[random.nextInt(firstNames.length)] + "@" + rootDomains[random.nextInt(rootDomains.length)] + TopLevelDomain.COM;
                break;
            case 1:
                builder = lastNames[random.nextInt(lastNames.length)] + "" + randomNumber + "@" + rootDomains[random.nextInt(rootDomains.length)] + "." + TopLevelDomain.COM;
                break;
            case 2:
                builder = firstNames[random.nextInt(firstNames.length)] + "" + randomYear + "@" + rootDomains[random.nextInt(rootDomains.length)] + "." + TopLevelDomain.COM;
                break;
        }
        return builder;


    }


}
