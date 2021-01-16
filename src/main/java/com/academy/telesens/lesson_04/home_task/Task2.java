package com.academy.telesens.lesson_04.home_task;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        /*
        Напишите программу, которая: считывает строку, выводит исходную строку, выводит количество
        и список слов, которые заканчиваются буквами 'ED'
         */

        Scanner scanner= new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели следующюю строку: "+ text);
        result(text);
    }

    public static void result (String text){
        int count = 0;
        String[] words = text.split(" "); //разбиваю строку обрзоввывая массив
        //System.out.println(Arrays.toString(words));
        System.out.println("Список слов которые заканчиваються на 'ED': ");

        for(int i=0;i<words.length;i++){
            //проверяю что элемент массива заканчивается на ED (последний и предпоследний символ)
            if(words[i].charAt((words[i].length())-1)=='D' && words[i].charAt((words[i].length())-2)=='E'){
                count++;
                System.out.println(words[i]);
            }
        }
        System.out.println("Количество слов которые заканчиваються на 'ED': "+count);
    }
}
