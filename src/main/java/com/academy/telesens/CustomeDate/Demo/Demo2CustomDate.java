package com.academy.telesens.CustomeDate.Demo;

import com.academy.telesens.CustomeDate.CustomDate;

import java.util.Random;

public class Demo2CustomDate {
    /*
 Создать массив размера 10, состоящий из классов CustomDate
наполнить массив случайными значениями действительных дат
вывести все даты массива на консоль
вывести только даты месяца февраль
вывести только даты понедельника
     */
    public static void main(String[] args) {
        CustomDate customDate = new CustomDate();
        Random random = new Random();
        //CustomDate[] arrCustomDate = new CustomDate[10];
        String[] arrCustomDate = new String[10];

        for(int i=0;i<arrCustomDate.length;i++){
            customDate.setDay(random.nextInt(31)+1);
            customDate.setMonth(random.nextInt(12)+1);
            customDate.setYear(1900+random.nextInt(200+1)); //будут даты только от 1900 до 2100
            //customDate.getFormattedDate();
            arrCustomDate[i] = customDate.getFormattedDate();
        }
        //System.out.println(Arrays.toString(arrCustomDate));

        System.out.println("\n Печатаем массив дат:\n");
        for(int j=0; j<arrCustomDate.length;j++){
            System.out.print(arrCustomDate[j]+"\n");
            //System.out.println(arrCustomDate[j].substring(3, 5));
        }
        System.out.println("\n только даты месяца февраль\n ");
        for(int n=0; n<arrCustomDate.length;n++){
            String tempSubs = arrCustomDate[n].substring(3, 5);
            //System.out.println(tempSubs);
            if(tempSubs.equals("02")) {
                System.out.print(arrCustomDate[n]+"\n");
            }
        }
        System.out.println("\n только Понедельники\n ");
        for(int m=0; m<arrCustomDate.length;m++){
            String tempSubs = arrCustomDate[m].substring(11);
            //System.out.println(tempSubs);
            if(tempSubs.equals("Понедельник")) {
                System.out.print(arrCustomDate[m]+"\n");
            }
        }


        //customDate.getFormattedDate();
        //customDate.validate(1,12,2020);
    }
}
