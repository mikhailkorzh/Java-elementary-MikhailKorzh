package com.company.cource.lectures.lecture8_abstract;

import java.io.File;
import java.io.FileWriter;

public class FileLogger extends MyLogger {
    @Override
    public void log(String msg) {
        try {
            FileWriter f = new FileWriter("log.txt", true);
            step++;
            f.write(step + ") " + getFormattedLog()+ " " + msg + "\n");
            f.close();
        }catch (Exception e){

        }

    }
}
