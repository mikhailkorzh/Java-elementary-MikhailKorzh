package com.company.cource.homeworks.lecture5;

public class ReduceFraction {
    public int comd;
    public int newNomAnswer;

    public ReduceFraction(int newNomAnswer, int comd) {
        this.newNomAnswer = newNomAnswer;
        this.comd = comd;
    }



    void reduceFraction()
    {
        int d;
        d = __gcd(comd, newNomAnswer);

        comd = comd / d;
        newNomAnswer = newNomAnswer / d;


       //System.out.println("x = " + newNomAnswer + ", y = " + comd );

       //ToStringTransformator toSting = new ToStringTransformator (newNomAnswer,comd);
       //System.out.println(toSting.toString());
    }
    static int __gcd(int comd, int newNomAnswer)
    {
        if (newNomAnswer == 0)
            return comd;
        return __gcd(newNomAnswer, comd % newNomAnswer);

    }

}
