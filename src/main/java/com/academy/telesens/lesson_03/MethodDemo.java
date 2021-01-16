package com.academy.telesens.lesson_03;

public class MethodDemo {
    public static void main(String[] args) {
        int n1 =1;
        int n2 = 4;
        int sum1 = n1+n2;
        int sum2 = sum(1,4);
        System.out.println(sum1);
        System.out.println(sum2);
        //вызвать метод
        //reverseNumbers(12,2,3);
    }

    //метод суммы
    public static int sum(int arg1, int arg2){
        int sum = arg1+arg2;
        return sum; //возвращаем результат
    }
        //метод выводит числа в обратном порядке
    public static void reverseNumbers(String[] arg) {
        for(int i = 0; i<arg.length;i++){
            System.out.println(arg[i]);
        }
    }

}
