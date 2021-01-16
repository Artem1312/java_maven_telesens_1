package com.academy.telesens.lesson_04.home_task;

import javax.crypto.spec.PSource;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        /*
        Реализовать программу, которая определяет, является ли строка палиндромом.
        Палиндром - это строка, которая одинаково читается одинаково в обоих направлениях
        (пример: "мадам" - палиндром, "адам" - не палиндром).
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели строку: "+text);

        String revers = reversString(text);
        String tempText = preparingTemp(text);
        String tempRevers = preparingTemp(revers);
        stringСomparison(tempText, tempRevers, revers);
    }

    public static String reversString(String text) {
        //переворачиваем строку
        String revers = "";
        for(int i=text.length()-1;i>=0;i--){
            revers+=text.charAt(i);
        }
        return revers;
    }

    public static String preparingTemp(String line) {
        //избавляемся от пробелов и прочих символов в строке
        String temp ="";
        for(int j=0;j<line.length();j++){
            if(line.charAt(j)!=' ' || line.charAt(j)!=',' || line.charAt(j)!='.'|| line.charAt(j)!='!' || line.charAt(j)!='?'){
                temp+=line.charAt(j);
            }
        }
        return temp;
    }

    public static void stringСomparison(String tempText, String tempRevers, String revers) {
        //Проверяем и выводим результат
        if (tempText.equalsIgnoreCase(tempRevers)){
            System.out.println("Строка являеться палиндромом: ");
            System.out.println(revers);
        }else{
            System.out.println("Строка не являеться палиндромом: ");
            System.out.println(revers);
        }
    }
}
