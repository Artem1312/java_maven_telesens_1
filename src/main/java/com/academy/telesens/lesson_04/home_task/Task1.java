package com.academy.telesens.lesson_04.home_task;

import java.util.Arrays;
import java.util.Scanner;

public class Task1 {
    public static void main (String[] args) {
        /*
        Напишите программу, которая: считывает строку, выводит исходную строку, выводит количество и список слов,
        которые начинаются на букву 'd'
         */
        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели следующюю строку: "+ text);
        count_d(text);
    }

    public static void count_d (String text){
        int count = 0;
        String[] words = text.split(" "); //разбиваю строку обрзоввывая массив
        //System.out.println(Arrays.toString(words));
        for(int i=0;i<words.length;i++){
            if(words[i].charAt(0)=='d'){        //проверяю что элемент массива начинаеться на 'd'
                count++;
                System.out.println(words[i]);
            }
        }
        System.out.println("Количество слов которые начинаються на 'd': "+count);
    }
}
