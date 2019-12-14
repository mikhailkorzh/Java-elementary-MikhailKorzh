package com.company.cource.lectures.lecture1;

public class EvenOrOddValue {
    public static void main(String[] args) {
        //
        int[] a = {2,6,7,9}; //инициализация массива
        ReturnEvenOrOddValue returnValue1 = new ReturnEvenOrOddValue(a);//создание объекта класса и отправка массива в конструктор
        returnValue1.returnEvenOrOdd(); //вызов метода который возвращает нам перебранный массив с результатами
    }

    public static class ReturnEvenOrOddValue{
        int arr[] = new int[4]; //инициализация массива для передачи в конструктор

        public ReturnEvenOrOddValue(int[] arr) {  //конструктор
            this.arr = arr;
        }

        int[] returnEvenOrOdd(){ //метод, который вычисляет остаток от деления
            for (int i = 0;i<arr.length;i++){
                if (arr[i]%2==0){
                    System.out.println("Element "+arr[i]+" position# "+i+" in the array is even");
                }
                else {
                    System.out.println("Element "+arr[i]+" position# "+i+" in the array is odd");
                }
            }
            return arr;
        }
    }
}
