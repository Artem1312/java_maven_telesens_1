package com.academy.telesens.lesson_08.home_task;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        Factorial factorial = number -> {
            int sum = 1;
            for(int i=num;i>0;i--){
                sum *= i;
            }
            return sum;
        };
        System.out.println(factorial.result(num));
    }
}
