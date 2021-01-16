package com.academy.telesens.lesson_04.home_task;

import java.awt.*;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /*
        Реализовать программу, которая: считывает с клавиатуры строку, удаляет из строки все цифры,
	     выводит исходную строку, выводит преобразованную строку, выводит список удаленных символов
         */

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        System.out.println("Вы ввели строку: "+text);
        result(text);
    }

    public static void result(String text) {
        String onlyText = "";
        String onlyNumbers = "";
        for(int i=0;i<text.length();i++){
            if(text.charAt(i)>='0'&& text.charAt(i)<='9'){
                onlyNumbers+= text.charAt(i);
            }else{
                onlyText+= text.charAt(i);
            }
        }
        System.out.println("Преобразованная строка: "+ onlyText);
        System.out.println("Удаленные символы: "+ onlyNumbers);
    }
}
