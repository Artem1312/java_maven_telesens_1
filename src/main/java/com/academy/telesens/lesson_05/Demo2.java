package com.academy.telesens.lesson_05;

import java.util.Arrays;

public class Demo2 {
    public static void main(String[] args) {
        String data = "18 999 ₴, 29 999 ₴, 19 499 ₴, 26 555 ₴, 22 999 ₴, 27 777 ₴, 36 399 ₴, 23 349 ₴, 57 777 ₴";
        String[] sums = data.split(",");            //создаею масив строк разбив строку по ,
        int[] prise = new int[sums.length];               //создаю числовой масив

        for(int i=0; i<sums.length;i++ ){
                sums[i]= sums[i].replaceAll("[ ₴]",""); //убираем пробелы и символ ₴
                prise[i]=Integer.parseInt(sums[i]);             //способ перевода строки в число
        }
        System.out.println(Arrays.toString(prise));     //вывод масив чисел
        Arrays.sort(prise);                             //сортируем
        System.out.println(Arrays.toString(prise));     //выводим отсортированый
    }
}
