package com.academy.telesens.lesson_04.home_task;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Напишите программу, которая: считывает строку, считывает подстроку ,выводит исходные строку и подстроку
        и выводит кол-во вхождений строки в подстроку
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String text = scanner.nextLine();
        System.out.print("Введите подстроку: ");
        String subText = scanner.nextLine();

        System.out.println("Вы ввели строку: "+ text);
        System.out.println("Вы ввели подстроку: "+ subText);

        result(text, subText);
    }

    public static void result (String text, String subText) {
        String temp;
        int count = 0;

        for(int i=0; i<text.length();i++){                      //посимвольно прохожусь по строке
            if(i+subText.length() <= text.length()){            //слежу что бы не превысить длину исходной строки
                temp = text.substring(i,i+subText.length());    //создаю временную подстроку
            }else break;                                        //когда достигаю что text.lenght()==i+subText.length() то прерываю цикл

            //System.out.println(temp);
            if(temp.equals(subText)){                           //сраниваю введенную подстроку с временной
                count++;
            }
        }
        System.out.println(count);
    }
}
