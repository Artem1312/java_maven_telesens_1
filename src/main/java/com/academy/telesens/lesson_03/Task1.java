package com.academy.telesens.lesson_03;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println("Сумма чисел:  "+sum);
    }
}
