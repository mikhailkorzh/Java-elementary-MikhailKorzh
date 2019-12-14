package com.company.cource.homeworks.testNew;

public class Fraction {
    private final int numerator;
    private final int denominator;

    Fraction() {
        numerator = 0;
        denominator = 1;
    }

    Fraction (int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        } else {
            this.denominator = denominator;
        }
    }

    public String getFraction() {
        return numerator + "/" + denominator;
    }
    public double getFractionDecimal() {
        return ((double) numerator) / denominator;
    }

    // Mathematical functions

    public String addFraction(Fraction otherFraction) {
        // Sum formula: a/b + c/d = (ad + cb)/bd
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return ((a*d) + (c*b)) + "/" + (b*d);
    }

    public String subtractFraction(Fraction otherFraction) {
        // Subtraction formula: a/b - c/d = (ad - cb)/bd
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return ((a*d) - (c*b)) + "/" + (b*d);
    }

    public String multiplyByFraction(Fraction otherFraction) {
        // Multiplication formula: a/b * c/d = ac/bd
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return (a*c) + "/" + (b*d);
    }

    public String divideByFraction(Fraction otherFraction) {
        // Division formula: (a/b) / (c/d) = ad/bc
        int a = this.numerator;
        int b = this.denominator;
        int c = otherFraction.numerator;
        int d = otherFraction.denominator;
        return (a*d) + "/" + (b*c);
    }
}