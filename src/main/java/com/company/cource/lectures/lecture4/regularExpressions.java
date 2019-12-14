package com.company.cource.lectures.lecture4;

import java.sql.SQLOutput;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regularExpressions {

    public static void main (String[] args){
        Pattern p = Pattern.compile("a");
        Matcher m = p.matcher("I'm learning Java");

        while (m.find()){
            System.out.println(m.start() + " " + m.group());
        }
        System.out.println("");

    }
}
