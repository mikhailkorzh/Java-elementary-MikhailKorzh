/*
package com.company.cource.homeworks.homeworks.lecture4;

public class findTotalWarsWithPriceLimit {
    static void //findPriceLimit(int[] warsPrice, int alimit) {
        for (int i = 0; i < warsPrice.length;i++) {
            int min = warsPrice[i];
            int min_i = i;
            for (int j = i + 1; j < warsPrice.length; j++) {
                //Если находим, запоминаем его индекс
                if (warsPrice[j] < min) {
                    min = warsPrice[j];
                    min_i = j;
                }
            }
            if (i != min_i) {
                int tmp = warsPrice[i];
                warsPrice[i] = warsPrice[min_i];
                warsPrice[min_i] = tmp;
            }


        }
    }
        public static void main (String[]args){
            int warsPrice1[] = {2, 3, 45, 4, 15, 3, 42};
            int limit1 = 50;
            System.out.println(findPriceLimit(warsPrice1, limit1));
        }
}
*/
