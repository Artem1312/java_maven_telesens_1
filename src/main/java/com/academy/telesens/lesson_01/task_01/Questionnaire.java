package com.academy.telesens.lesson_01.task_01;

import java.util.Scanner;

public class Questionnaire {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.next();
        System.out.print("Введите фамилию: ");
        String secondName = scanner.next();
        System.out.print("Введите отчество: ");
        String midleName = scanner.next();
        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();
        System.out.print("Выберете пол (м/ж): ");
        String s = scanner.next();
        System.out.print("Введите телефон (10 цифр): ");
//        int phone = scanner.nextInt();
        String phone = scanner.next();

        System.out.println();
        System.out.println("-------Абонент-------");
        System.out.println("Имя: "+name);
        System.out.println("Фамилия: "+secondName);
        System.out.println("Отчество: "+midleName);
        System.out.println("Возраст: "+age);
        System.out.println("Пол: "+s);
        System.out.println("Номер: "+phone);
        //0000
    }
}
