package com.academy.telesens.lesson_01.task_01;

import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {

        String text[] = {
                "Peter Привет!",
                "Peter Это моя первая программа. Я пишу на Java.",
                "Программировать - это интересно.",
                "Моя цель восполнить пробелы",
                "в программировании и написать",
                "проект с нуля!"
        };
        String prefix = "";
        String postfix = "";

        if(args.length==0){   //на тот случай если аргументы небыли переданы при запуске (повторно запрашиваем в процессе выполнения)
            System.out.print("Введите префикс ");
            Scanner scanner = new Scanner(System.in);
            prefix += scanner.nextLine();
            System.out.print("Введите постфикс ");
            postfix += scanner.nextLine();

            for(int i=0;i<text.length;i++){
                System.out.println(prefix + " "+text[i]+" "+postfix);
            }

        }else if(args.length==1){               //был передан один агрумент, принимаем его за префикс
            prefix += args[0];
            for(int i=0;i<text.length;i++){
                System.out.println(prefix + " "+text[i]);
            }
        }else if (args.length==2){              //было передано два агрумента
            prefix += args[0];
            postfix += args[1];
            for(int i=0;i<text.length;i++){
                System.out.println(prefix + " "+text[i]+" "+postfix);
            }
        // учитываем тот случай если аргументов было передано более двух
        }else System.out.println("Вы ввели более двух аргументов. Принимаем только 2 аргумента");
    }
}
