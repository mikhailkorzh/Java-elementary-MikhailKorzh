package com.company.cource.lectures.exersises;

import org.apache.commons.lang3.StringUtils;

public class ReverseWords {
    public static void main(String[] args) {
        ReverseResult reverseResult = new ReverseResult("Do you speak english");
        //System.out.println(reverseResult.getReverseString());
        reverseResult.getResultsNew();

    }

}

class ReverseResult{
    private String reverseString;

    public ReverseResult(String reverseString) {
       // this.reverseString = StringUtils.reverseDelimited(StringUtils.reverse(reverseString), ' ');
       //this.reverseString = StringUtils.reverseDelimited(reverseString,' ');
        this.reverseString = StringUtils.reverse(reverseString);
    }

    /*public String getReverseString() {
        return reverseString;
    }*/

    public void getResultsNew(){
        System.out.println(reverseString);
    }
}


