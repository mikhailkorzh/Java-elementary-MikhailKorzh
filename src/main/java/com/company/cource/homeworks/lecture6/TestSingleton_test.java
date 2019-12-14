package com.company.cource.homeworks.lecture6;

public class TestSingleton_test {
    public static void main(String[] args) {

        String sss = "dd";
        String sss1 = "dd1";
        //MySingleton firstInstance = MySingleton.getInstance(sss);
       // MySingleton firstInstance1 = MySingleton.getInstance(sss);
        System.out.println(MySingleton_test.getInstance("1").s1);
        System.out.println(MySingleton_test.getInstance("2").s1);


    }

}
