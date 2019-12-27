package com.company.cource.homeworks.lecture7_1_inheritance;

public class Order_ {
    protected String date;
    protected String time;
    protected int id;


    protected Order_(String date, String time, int id) {
        this.date = date;
        this.time = time;
        this.id = id;
    }


    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public int getId() {
        return id;
    }

    public String getType(){
        return "";
    }
}
