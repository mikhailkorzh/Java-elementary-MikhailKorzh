package com.company.cource.lectures.lecture8_abstract;

public class AppLog {
    public static void main(String[] args) {
        MyLogger logger = new FileLogger();
        logger.log("Hello World!");
        logger.log("Java abstract");
    }
}
