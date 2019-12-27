package homeworks.lecture11_enums;

import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

public enum Day {
    MONDAY(1, 8),
    TUESDAY(2, 8),
    WEDNESDAY(3, 8),
    THURSDAY(4, 8),
    FRIDAY(5, 6),
    SATURDAY(6, 0),
    SUNDAY(7, 0);

    private int daysSequenceNumber;
    private int workingHoursQuantityPerDay;


    Day(int daysSequenceNumber, int workingHoursQuantityPerDay) {
        this.daysSequenceNumber = daysSequenceNumber;
        this.workingHoursQuantityPerDay = workingHoursQuantityPerDay;
    }


    public int getDaysSequenceNumber() {
        return daysSequenceNumber;
    }

    public int getWorkingHoursQuantityPerDay() {
        return workingHoursQuantityPerDay;
    }

    /*@Override
    public String toString() {
        return "Day{" +
                "daysSequenceNumber=" + daysSequenceNumber +
                ", workingHoursQuantityPerDay=" + workingHoursQuantityPerDay +
                '}';
    }*/
}
