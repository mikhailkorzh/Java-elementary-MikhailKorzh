package com.company.cource.lectures.lecture6;

public class HelloWorld {
    private int iValue;

/*    private HelloWorld(HelloWorld value) {

    }*/

    public HelloWorld(int iValue) {
        this.iValue = iValue;
    }

    public int getiValue() {
        return iValue;
    }

    public void setiValue(int iValue) {
        this.iValue = iValue;
    }

    public static void main(String[] argvc) {
        HelloWorld hw = new HelloWorld(20);
        hw.getiValue();
        hw.setiValue(44);
        hw.getiValue();


        //hw.iValue = 25;
        //hw.setiValue(44);


        //changeIt(hw);
        System.out.println(hw.iValue);
        //System.out.println("After changing : " + hw.iValue);
    }
}