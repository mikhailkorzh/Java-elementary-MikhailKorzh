package com.company.cource.homeworks.lecture5;


public class FractionNumber {

    private final int nom1;
    private final int denom1;
    private final int nom2;
    private final int denom2;
    private int comd;
    private int newNomAnswer;



    public FractionNumber(int nom1, int denom1, int nom2, int denom2) {
        this.nom1 = nom1;
        this.denom1 = denom1;
        this.nom2 = nom2;
        this.denom2 = denom2;
        if(denom1 == 0) {
            throw new IllegalArgumentException("denominator is zero");
        }
        if(denom2 == 0) {
            throw new IllegalArgumentException("denominator is zero");
        }
        if(denom1 < 0) {
            nom1 *= -1;
            denom1 *= -1;
        }if(denom2 < 0) {
            nom2 *= -1;
            denom2 *= -1;
        }

    }

    public void plusValues(){
        comd = denom1*denom2; //creates common denominator by multiplying both denominators
        newNomAnswer = nom1*denom2 + nom2*denom1;

        System.out.println(nom1 + "/" + denom1 + " + " + nom2 + "/" + denom2 + " = " + newNomAnswer + "/" + comd);
        ReduceFraction reduceFraction = new ReduceFraction (newNomAnswer, comd);
        reduceFraction.reduceFraction();
    }
    public void minusValues(){
        comd = denom1*denom2;
        newNomAnswer = nom1*denom2 - nom2*denom1;
        System.out.println(nom1 + "/" + denom1 + " - " + nom2 + "/" + denom2 + " = " + newNomAnswer + "/" + comd);
        ReduceFraction reduceFraction = new ReduceFraction (newNomAnswer, comd);
        reduceFraction.reduceFraction();
    }

    public void devideValues(){
        comd = nom1*denom2;
        newNomAnswer = denom1*nom2;
        System.out.println(nom1 + "/" + denom1 + " : " + nom2 + "/" + denom2 + " = " + newNomAnswer + "/" + comd);
        ReduceFraction reduceFraction = new ReduceFraction (newNomAnswer, comd);
        reduceFraction.reduceFraction();
    }
    public void multipleValues(){
        comd = nom1*nom2;
        newNomAnswer = denom1*denom1;
        System.out.println(nom1 + "/" + denom1 + " * " + nom2 + "/" + denom2 + " = " + newNomAnswer + "/" + comd);
        ReduceFraction reduceFraction = new ReduceFraction (newNomAnswer, comd);
        reduceFraction.reduceFraction();
    }
}