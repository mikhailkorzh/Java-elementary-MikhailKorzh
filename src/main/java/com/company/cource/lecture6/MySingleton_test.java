package com.company.cource.homeworks.lecture6;

public class MySingleton_test {
    private static MySingleton_test instance;
    public String s1;

    public MySingleton_test(String s1) {
        this.s1 = s1;
    }

    public static synchronized MySingleton_test getInstance(String s1) {
        if (instance == null) {
            instance = new MySingleton_test(s1);
        }

        return instance;
    }
}
