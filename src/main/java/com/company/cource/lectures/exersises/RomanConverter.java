package lectures.exersises;

import java.util.ArrayList;

public class RomanConverter {
    static RomanNumeral Numeral = new RomanNumeral();


    public static void main(String[] args) {
        System.out.println("Enter your Roman Numerals or Integer number:");
        boolean b = true;

        //Scanner console = new Scanner(System.in);

        //String value = console.next();
        String value = "45";

        try {
            char c = value.charAt(0);

            if (Character.isDigit(c)) {
                int int_value = Integer.parseInt(value);

                System.out.println("Roman value = " + Numeral.convertIntegerToRoman(int_value));
            } else {
                char[] strArr = value.toCharArray();
                if (checkSymbolsCount(strArr, 3))
                    System.out.println("Invalid format");
                else
                    System.out.println("Integer value = " + Numeral.convertRomanToInt(value));

            }
        } catch (NumberFormatException e) {
            System.out.println("Problem: Invalid format");
        }

    }

    private static boolean checkSymbolsCount(char[] strArr, int counter) {
        int c = 1;

        for (int i = 0; i < strArr.length; i++) {
            char element = strArr[i];
            if (i + 1 >= strArr.length)
                continue;

            if (element == strArr[i + 1]) {
                c++;
            }
        }

        return c > counter;
    }
}

class RomanNumeral {
    static String[] Rome = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X",
            "IX", "V", "IV", "I" };
    static int[] Arab = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };


    public static int convertRomanToInt(String romanNumeral) throws NumberFormatException {


                StringBuffer romeNumber = new StringBuffer(romanNumeral);
                int arabNumber = 0, i = 0;
// Проверяем переданную строку на наличие символов
                if (romeNumber.length() > 0) {
                    while (true) {
                        do {

                            if (Rome[i].length() <= romeNumber.length()) {
                                // Выделяем из строки подстроку и сравниваем со
                                // значением из массива Arab
                                if (Rome[i].equals(romeNumber.substring(0,
                                        Rome[i].length()))) {
                                    // После чего прибавляем число соответствующее
                                    // индексу элемента римской цифры из массива Arab
                                    arabNumber += Arab[i];
                                    // и удаляем из строки римскую цифру
                                   romeNumber.delete(0, Rome[i].length());
                                    if (romeNumber.length() == 0)
                                        return arabNumber;
                                } else
                                    break;
                            } else
                                break;
                        } while (true && romeNumber.length() != 0);
                        i++;
                    }
                }
                return 0;
    }

    public static StringBuffer convertIntegerToRoman(int number) {


        StringBuffer romanValue = new StringBuffer();
        int N = number;

        while (N > 0) {
            for (int i = 0; i < Arab.length; i++) {
                if (N < Arab[i]) {
                    N -= Arab[i - 1];
                    romanValue.append(Rome[i - 1]);
                    break;
                }
            }
        }
        return romanValue;
    }


}
