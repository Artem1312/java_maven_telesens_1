package com.academy.telesens.lesson_03.home_task;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размерность треугольника: ");
        int n = scanner.nextInt();

        //создаем два массива длиной n с пробелами и *
        char [] line1 = new char[n];
        char [] line2 = new char[n];
        for(int j = 0;j<n;j++){
            line1[j] = ' ';
        }
        for(int k = 0;k<n;k++){
            line2[k] = '*';
        }

        //обеденяем массивы в один n*2
        char [] array = new char[n*2];
        for(int i = 0; i<=array.length-1;i++){
            if(i<n){
                array[i]=line1[i];
            }else{
                array[i]=line2[i-n];
            }
        }
        //контрольная проверка, что слияние массивов успешное
        //System.out.println(Arrays.toString(array));

        //проходимся n раз по массиву, со смещением на каждом шаге
        for(int m=0;m<n;m++){
            for(int l=m+1;l<=n+m;l++){
                System.out.print(array[l]);
            }
            System.out.println();
        }
    }
}
