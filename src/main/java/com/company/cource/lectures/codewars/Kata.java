package lectures.codewars;

import javax.crypto.spec.PSource;

public class Kata {
    public static String highAndLow(String numbers) {

        String[] splited = numbers.split(" ");
        int size = splited.length;
        int [] arr = new int [size];
        for(int i=0; i<size; i++) {
            arr[i] = Integer.parseInt(splited[i]);
        }

        return getMax(arr) + " " + getMin(arr);

    }


    private static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){
            if(inputArray[i] > maxValue){
                maxValue = inputArray[i];
            }
        }
        return maxValue;
    }

    private static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }

    // Code here or
    //return "throw towel";
}