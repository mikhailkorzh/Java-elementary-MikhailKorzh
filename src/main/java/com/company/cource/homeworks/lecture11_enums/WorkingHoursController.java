package homeworks.lecture11_enums;

import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class WorkingHoursController {

    public static void main(String[] args) {
        int day;
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        calendar.setTime(new Date());
        day = calendar.get(Calendar.DAY_OF_WEEK)-1;

        HoursBeforeEndOfWeek dayOfWeek = new HoursBeforeEndOfWeek(day);
        System.out.println(dayOfWeek.calculate());


    }
}
