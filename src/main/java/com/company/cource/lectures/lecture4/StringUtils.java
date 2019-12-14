package com.company.cource.lectures.lecture4;


public class StringUtils {
    public static String randomString (String type, int length){
        String alphabet = "";
        switch (type){
            case "alpha":
                break;
            case "numeric":
                break;
            case "alphanumeric":
                break;
            default:
                System.out.println("Error");
        }

        String result = "";
         for (int i = 0; i <length; i++){
             int randomIndex = (int) (Math.random()*alphabet.length());
             result += alphabet.charAt(randomIndex);
         }

        return "";


    }
}
