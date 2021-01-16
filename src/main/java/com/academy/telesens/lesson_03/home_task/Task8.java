package com.academy.telesens.lesson_03.home_task;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите какого рамера напечатать квадрат: ");
        int n = scanner.nextInt();
        char [] line = new char[n];
        char [] side = new char[n];
        for(int k = 0;k<n;k++){
            line[k] = '*';
        }

        String line1 = new String(line);            //преобразовывем массив в строку

        for(int j = 0;j<=n-1;j++){
            if(j==0 || j==n-1){
                side[j] = '*';
            } else {
                side[j] = ' ';
            }
        }

        String side1 = new String(side);            //преобразовывем массив в строку

        //Печатаем квадрат
        for(int i=1;i<=n;i++){
            if(i ==1){
                //System.out.println(Arrays.toString(line));    // можем распечатать в виде массива
                System.out.println(line1);                      //печатаем в виде строки
            } else if (i>0 && i < n){
                //System.out.println(Arrays.toString(side));
                System.out.println(side1);
            } else {
                //System.out.println(Arrays.toString(line));
                System.out.println(line1);
            }
        }
    }
}
