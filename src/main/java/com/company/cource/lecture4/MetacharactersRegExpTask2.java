package com.company.cource.homeworks.lecture4;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetacharactersRegExpTask2 {

    public static void main (String[] args){
        Pattern p1 = Pattern.compile("2\\+2=4");
        Matcher m1 = p1.matcher("2+2=4");

        Pattern p2 = Pattern.compile("\\Q1+1=2\\E");
        Matcher m2 = p2.matcher("1+1=2");

         while (m1.find()){
            System.out.println(m1.start() + " " + m1.group());
        }
        System.out.println("");

        while (m2.find()){
            System.out.println(m2.start() + " " + m2.group());
        }
        System.out.println("");

    }
}
