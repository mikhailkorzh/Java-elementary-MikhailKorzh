package com.company.cource.homeworks.lecture4;
//HomeTask solution
public class ProductCodeValidationHomeTask1 {
    public static void main(String[] args) {
        String codeValidation = "AX6BYU56UX6CV6BNT7NM";
        String numbers = codeValidation.replaceAll("\\D","");
       //System.out.println(numbers);

        char[] numbersArray = numbers.toCharArray();
       // System.out.println(numbers.);
        int[] newInt = new int[6];

        for(int i=0; i<numbers.length(); i++){
            newInt[i] = Integer.parseInt(new String(String.valueOf(numbersArray[i])));
            //System.out.println(newInt[i]);
        }

        String newValue1 = newInt[0]+""+""+newInt[1];
        String newValue2 = newInt[2]+""+""+newInt[3];
        String newValue3 = newInt[4]+""+""+newInt[5];

        int newInt1 = Integer.parseInt(new String(newValue1));
        int newInt2 = Integer.parseInt(new String(newValue2));
        int newInt3 = Integer.parseInt(new String(newValue3));


        //int newInt = Integer.parseInt(new String(numbersArray));
        System.out.println(newInt1*newInt2*newInt3);



    }
}