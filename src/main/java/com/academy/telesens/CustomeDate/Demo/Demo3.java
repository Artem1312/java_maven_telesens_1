package com.academy.telesens.CustomeDate.Demo;

import com.academy.telesens.CustomeDate.CustomDateTime;

public class Demo3 {
    public static void main(String[] args) {
        CustomDateTime customDateTime = new CustomDateTime();
        customDateTime.getFormattedDate();

        for(int k=0;k<10000;k++){
            customDateTime.nextMinute();
            customDateTime.getFormattedDate();
        }
        System.out.println("*********");
        customDateTime.addSeconds(2147483646);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1000000);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(100000);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(10000);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1000);
        customDateTime.getFormattedDate();

        customDateTime.addSeconds(100);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(0);
        customDateTime.getFormattedDate();




        System.out.println(3600/3600);
        System.out.println(3600%3600);
        System.out.println(61/60);
        System.out.println(60%60);
        System.out.println(61%60);
    }
}
