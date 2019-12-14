package com.company.cource.homeworks.lecture5.lecture5_1_FractionNumber;

import java.util.HashSet;
import java.util.Set;

public class MainFractionNumberClass {
    public static void main(String[] args) {

        FractionNumber fNum1 =new FractionNumber(1,6);
        FractionNumber fNum2 = new FractionNumber(2,8);
        //System.out.println(fNum1.plusFractionValue(fNum2));
 /*     System.out.println(fNum1.minusFractionValue(fNum2));
        System.out.println(fNum1.multiplyFractionValue(fNum2));
        System.out.println(fNum1.devideFractionValue(fNum2));
*/
        if (fNum1.equals(fNum2)){
            System.out.println("Object are equals");
        }
        else {
            System.out.println("Object are not equals");
        }

        Set<FractionNumber> set = new HashSet<>();
        set.add(fNum1);
        set.add(fNum2);
        System.out.println("Number of objects: " + set.size());






        // System.out.println(fNum2);

    }
}