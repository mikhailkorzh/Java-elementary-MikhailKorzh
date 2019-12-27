package com.company.cource.homeworks.lecture7_1_inheritance;

public class OrdinaryOrder extends Order_ {
    public OrdinaryOrder(String date, String time, int id) {
        super(date,time,id);
    }

    @Override
    public String getType() {
        return "Ordinary";
    }

    @Override
    public String toString() {
        return "OrdinaryOrder{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", id=" + id +
                '}';
    }
}
