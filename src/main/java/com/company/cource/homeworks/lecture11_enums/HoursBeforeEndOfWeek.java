package homeworks.lecture11_enums;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HoursBeforeEndOfWeek {

    Day day = Day.valueOf(new SimpleDateFormat("EEEE").format(new Date()).toUpperCase());
    int sum = 0;
    private int dayOfWeek;

    public HoursBeforeEndOfWeek(int dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String calculate() {
        for (Day d : Day.values()) {
            if (this.day.equals(Day.SATURDAY)) {
                return Day.SATURDAY + " is a day off";
            }
            if (this.day.equals(Day.SUNDAY)){
                return Day.SUNDAY + " is a day off";
            }
            if (d.getDaysSequenceNumber() >= this.dayOfWeek){
                sum += d.getWorkingHoursQuantityPerDay();
            }
        }
        return "there's "+ sum + " hours from " + day + " to " + Day.FRIDAY;
    }

}
