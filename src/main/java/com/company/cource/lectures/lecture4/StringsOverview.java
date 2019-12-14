package com.company.cource.lectures.lecture4;

public class StringsOverview {

    public static void main (String[] args){

        String s = " my string ";
        String line = "1,User1,qwerty";
        String ss = s.trim().replace("my","not a");
        String ss2 [] = line.split(",");

        //String swap = "123";

        System.out.println(ss);
        System.out.println("User ID: " + ss2[0] + "; User name " + ss2[1] + "; User password: " + ss2[2]);

    }
}
