package com.academy.telesens.lesson_08.home_task;

import java.util.Scanner;
import java.util.function.IntFunction;

public class Demo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = scanner.nextInt();

        ReturnNum rtNum = number -> {
            if(num>= 10 && num<= 20) {
                return true;
            } return false;
        };
        System.out.println(rtNum.result(num));
    }
}
