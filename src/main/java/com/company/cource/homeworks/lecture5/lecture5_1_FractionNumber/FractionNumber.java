package com.company.cource.homeworks.lecture5.lecture5_1_FractionNumber;

import java.util.Objects;

public class FractionNumber {
    private final int nominator;
    private final int denominator;

    FractionNumber(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
        if(denominator == 0) {
            throw new IllegalArgumentException("denominator is zero");
        }
        if(denominator < 0) {
            nominator *= -1;
            denominator *= -1;
        }
    }

    public int getNominator() {
        return nominator;
    }

    public int getDenominator() {
        return denominator;
    }


    /*public  boolean equals(FractionNumberTransformation transformation){
        //FractionNumberTransformation other = (FractionNumberTransformation)transformation;
        return this.nominator==getNominator() && this.denominator==getNominator();
    }*/

    @Override
    public boolean equals(Object o) {
        System.out.println("Equals is called: " + this);
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FractionNumber that = (FractionNumber) o;
        return nominator == that.nominator &&
                denominator == that.denominator;
    }


    @Override
    public int hashCode() {
        System.out.println("Hashcode is called: " + this);
        return Objects.hash(nominator, denominator);
    }

    public FractionNumber plusFractionValue(FractionNumber transformation){ //fNum2
        if (this.denominator==transformation.getDenominator()) {
            return new FractionNumber(
                    this.nominator+transformation.getNominator(), transformation.getDenominator());
        }
        else{

            int tempNominator = this.nominator*transformation.getDenominator() + transformation.getNominator()*this.denominator;
            int tempDenominator = this.denominator*transformation.getDenominator();

            return new FractionNumber(tempNominator,tempDenominator);
        }
    }

    public FractionNumber minusFractionValue(FractionNumber transformation){
        if (this.denominator==transformation.getDenominator()) {
            return new FractionNumber(
                    this.nominator+transformation.getNominator(), transformation.getDenominator());
        }
        else{

            int tempNominator = this.nominator*transformation.getDenominator() - transformation.getNominator()*this.denominator;
            int tempDenominator = this.denominator*transformation.getDenominator();

            return new FractionNumber(tempNominator,tempDenominator);
        }
    }

    public FractionNumber multiplyFractionValue(FractionNumber transformation){
        return new FractionNumber(
                this.nominator*getNominator(),
                this.denominator*getDenominator()
        );
    }
    public FractionNumber devideFractionValue(FractionNumber transformation){
        return new FractionNumber(
                this.nominator*getDenominator(),
                this.denominator*getNominator()
        );
    }


    @Override
    public String toString() {
        return "FractionNumberTransformation{" +
                "nominator=" + nominator +
                ", denominator=" + denominator +
                '}';
    }

}
