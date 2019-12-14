package com.company.cource.lectures.lecture1;

public class MinValueInArray {
    public static void main(String[] args) {
        int[] a = {4,3,2};
        int min = a[0];
        for (int i = 0; i<a.length; i++){
            if(a[i]<min){
                min=a[i];
            }
        }
        System.out.println(min);
    }
}
