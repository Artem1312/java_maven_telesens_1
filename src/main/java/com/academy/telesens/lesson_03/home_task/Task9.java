package com.academy.telesens.lesson_03.home_task;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность треугольника: ");
        int n = scanner.nextInt();
        String text = "";
        for(int i=0;i<n;i++){
            text+="*";
            System.out.println(text);
        }
    }
}
