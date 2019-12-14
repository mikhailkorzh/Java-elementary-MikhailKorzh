package com.company.cource.homeworks.testNew;

//import static sun.jvm.hotspot.runtime.PerfMemory.start;

public class JustTry {
    //JustTry try1 = new JustTry();
public int nom1;
public int denom1;
public int nom2;
public int denom2;

    public JustTry(int nom1, int denom1, int nom2, int denom2) {
        this.nom1 = nom1;
        this.denom1 = denom1;
        this.nom2 = nom2;
        this.denom2 = denom2;
    }

        public void add(){

            int comd = denom1*denom2; //creates common denominator by multiplying both denominators

            int newNomAnswer = nom1*denom2 + nom2*denom1;


            System.out.println(nom1 + "/" + denom1 + " + " + nom2 + "/" + denom2 + " = " + newNomAnswer + "/" + comd);


            //start();
        }

    public static void main(String[] args) {
        JustTry try1 = new JustTry(2, 3, 1, 3);
        try1.add();

    }
}
