package lectures.fakedata.utils;

import lectures.fakedata.enums.FirstName;
import lectures.fakedata.enums.LastName;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.TimeZone;

public class RandomUtils {
    public static int randomNumber(int maxValue) {
        return new Random().nextInt(maxValue);
    }

    public static int randBetween(int start, int end) {
        return start + (int) Math.round(Math.random() * (end - start));
    }

    public static String getRandomPerson() {
        return LastName.values()[randomNumber(LastName.values().length)] + "." + FirstName.values()[randomNumber(FirstName.values().length)];
    }

    public static LastName getRandomLastName() {
        return LastName.values()[randomNumber(LastName.values().length)];
    }

    public static FirstName getRandomFirstName() {
        return FirstName.values()[randomNumber(LastName.values().length)];
    }

    public static int calculateCurrentYear() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(new Date());
        int currentYear = calendar.get(Calendar.YEAR);
        return currentYear;
    }

    public static int calculateNextYear() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(new Date());
        int nextYear = calendar.get(Calendar.YEAR + 1);
        return nextYear;
    }

    public static int calculateCurrentMonth() {
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(new Date());
        int currentMonth = calendar.get(Calendar.MONTH);
        return currentMonth;
    }

}
