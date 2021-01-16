package com.academy.telesens.lesson_04.home_task;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        /*
        Реализовать программу, которая: считывает строку, выводит исходную строку на экран,
        выводит кол-во символов латиницы, выводит кол-во символов кириллицы
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели строку: "+text);
        giveCountLtAndKrLetters(text);
    }

    public static void giveCountLtAndKrLetters(String text) {
        int count_KR = 0;
        int count_LT = 0;

        for(int i=0;i<text.length();i++){
            if((text.charAt(i)>='А'&& text.charAt(i)<='Я') || (text.charAt(i)>='а'&& text.charAt(i)<='я')){
                count_KR++;
            } else if ((text.charAt(i)>='A'&& text.charAt(i)<='Z') || (text.charAt(i)>='a'&& text.charAt(i)<='z')){
                count_LT++;
            }
        }
        System.out.println("Количество символов на кириллице: "+count_KR);
        System.out.println("Количество символов на латинице: "+count_LT);
    }
}
