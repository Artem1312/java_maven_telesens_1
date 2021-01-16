package com.academy.telesens.lesson_08.home_task;

import java.util.Scanner;

public class Demo4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String userInput = scanner.nextLine();

//        ReturnStringWithoutGaps returnStringWithoutGaps = new ReturnStringWithoutGaps() {
//            @Override
//            public String result(String userInput) {
//                return userInput.replaceAll("\\s+","");
//            }
//        };

        ReturnStringWithoutGaps returnStringWithoutGaps = str -> userInput.replaceAll("\\s+","");

        System.out.println(returnStringWithoutGaps.result(userInput));
    }
}
