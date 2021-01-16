package com.academy.telesens.lesson_04.home_task;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*
        Реализовать программу, которая: принимает строку. Выводит массив слов, которые содержат символ @
		Например: Входная строка: "Если возникли вопросы обращайтесь в службу поддержки
		support@gmail.com или central.office@mail.com"
		Результат: [support@gmail.com, central.office@mail.com]
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        //тестовая строка
        //String text = "Если возникли вопросы обращайтесь в службу поддержки support@gmail.com или central.office@mail.com";

        int count = count(text);
        result(count, text);
    }

    public static Integer count(String text) {
        int count = 0;
        for(int m=0;m<text.length();m++){
            if(text.charAt(m)=='@'){
                count+=1;                                 //считаю сколько раз встречаеться @
            }
        }
        return count;
    }

    public static void result(int count, String text) {
        String[] words = text.split(" ");           //разбиваю строку обрзоввывая массив
        String[] result = new String[count];
        int t=0;

        for(int i=0;i<words.length;i++){                  //прохожусь по всем элементам массива
            char temp[] = words[i].toCharArray();         //каждый элемент массива перобразовываю в массив temp
            for(int j=0;j<temp.length;j++){
                if(temp[j] == '@'){                       //внутри массива temp ищу @
                    result[t] = words[i];                 //в случае совпадения добавляю email в массив result
                    t++;                                  //
                }
            }
        }
        System.out.println(Arrays.toString(result));
    }
}
