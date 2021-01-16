package com.academy.telesens.lesson_08.home_task;

import java.util.Scanner;

public class Demo3 implements getUpperString{
    @Override
    public String result(String str) {
        return null;
    }

    /*
        3)  Создайте лямбда-выражение, которое переводит символы строки в верхний регистр.
            Перевести строку в верхний регистр с помощью лямбда-выражения.
            Перевести строку в верхний регистр с помощью ссылки на метод.
         */
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.print("Введите строку: ");
          String userInput = scanner.nextLine();

          getUpperString reversString = str -> str.toUpperCase();
          System.out.println(reversString.result(userInput));

          //getUpperString reversString1 = String::toUpperCase();
          //System.out.println(reversString1.result(userInput));



          //Consumer<String> consumer = str -> System.out.println(str);
          //Consumer<String> consumer = System.out::println;

    }
}
