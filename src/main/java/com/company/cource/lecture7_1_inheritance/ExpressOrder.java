package com.company.cource.homeworks.lecture7_1_inheritance;

public class ExpressOrder extends Order_ {

    private String courier;
    private int daysToDeliver;

    protected ExpressOrder(String date, String time, int id, String courier, int daysToDeliver) {
        super(date, time, id);
        this.courier=courier;
        this.daysToDeliver=daysToDeliver;
    }

    public String getCourier() {
        return courier;
    }

    public int getDaysToDeliver() {
        return daysToDeliver;
    }

    @Override
    public String getType() {
        return "Express";
    }

    @Override
    public String toString() {
        return "ExpressOrder{" +
                "courier='" + courier + '\'' +
                ", daysToDeliver=" + daysToDeliver +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", id=" + id +
                '}';
    }
}
