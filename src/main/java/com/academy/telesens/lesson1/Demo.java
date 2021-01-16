package com.academy.telesens.lesson1;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args){
        System.out.println("Привет мир!");
        System.out.println("Привет мир!");
        System.out.println("Привет мир!");

        //вывод на консоль и курсор остается на текущей строке (когда нет \n)
        System.out.print("one\n");
        System.out.print("two");
        System.out.print("three\n");

        //матирование строк (устаревший)
        System.out.printf("My name is %s; My address %s%n", "Artem", "Kharkiv");

        //Форматирование строк (более правильный)
        System.out.println(String.format("My name is %s; My address %s; age %d", "Artem", "Kharkiv", 29));


        //ввод с консоли
        System.out.print("Введите ваше имя: ");
        Scanner scanner = new Scanner(System.in);           // настраиваем сканер
        String name = scanner.nextLine();                   //считываем имя с консоли
        System.out.println(String.format("Привет %s", name));   //выводим приметсвие


    }
}
