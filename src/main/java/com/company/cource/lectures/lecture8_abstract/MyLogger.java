package com.company.cource.lectures.lecture8_abstract;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class MyLogger {

    protected int step = 0;
    protected String getFormattedLog(){
        return "[" + getCurrentTime() +"] "+ Thread.currentThread().getName();
    }
    private String getCurrentTime(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.YYYY");
        return sdf.format(new Date());
    }

    public abstract void log(String msg);
}
