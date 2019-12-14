package com.company.cource.homeworks.lecture1;

public class AvgMassInt {
    public static void main(String[] args) {
        double [] massAvg = {1,5,9};
        double sum = 0;

        for(int i =0; i<massAvg.length;i++){
            sum=sum+massAvg[i];
        }
        sum=sum/massAvg.length;
        System.out.println(sum);


    }
}
