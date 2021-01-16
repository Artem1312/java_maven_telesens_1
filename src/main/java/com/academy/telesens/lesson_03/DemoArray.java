package com.academy.telesens.lesson_03;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DemoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = new int[10];
        //numbers[2] = 4;

        System.out.println(Arrays.toString(numbers));
        Random random = new Random();

        //вывести на консоль в обратном порядке
        for(int i = 0; i<numbers.length;i++){
            //System.out.print("Введите элемент массива");
            //numbers[i] = scanner.nextInt();
            numbers[i] = random.nextInt(100);
        }
        for(int i = numbers.length-1;i>=0;i--){
            System.out.println(numbers[i]);
        }
        double[] doubleNumbers = new double[30];

        for(int k = 0;k <doubleNumbers.length; k++){
            //doubleNumbers[k] =
        }
    }
}
