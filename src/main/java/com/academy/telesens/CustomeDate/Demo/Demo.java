package com.academy.telesens.CustomeDate.Demo;

import com.academy.telesens.CustomeDate.CustomDateTime;

public class Demo {
    public static void main(String[] args) {
        //CustomDate customDate = new CustomDate();
        CustomDateTime customDateTime = new CustomDateTime();

        customDateTime.setYear(2020);
        customDateTime.setMonth(12);
        customDateTime.setDay(13);
        customDateTime.setHour(23);
        customDateTime.setMinute(59);
        customDateTime.setSecond(59);
        customDateTime.getFormattedDate();
        customDateTime.getFormattedDate(true);
        customDateTime.getFormattedDate(false);
        customDateTime.getFormattedDate(false);
        //customDateTime.getFormattedDate(2020, 15, 20, 15,15,15);
        System.out.println("***************");
        customDateTime.nextSecond();
        customDateTime.getFormattedDate();
        customDateTime.nextMinute();
        customDateTime.getFormattedDate();
        customDateTime.nextHour();
        customDateTime.getFormattedDate();
        customDateTime.nextDay();
        customDateTime.getFormattedDate();
        customDateTime.nextMonth();
        customDateTime.getFormattedDate();
        customDateTime.nextYear();
        customDateTime.getFormattedDate();
        System.out.println("***********");

//        customDateTime.addSeconds(86400);
//        customDateTime.getFormattedDate();
//        customDateTime.addSeconds(3600);
//        customDateTime.getFormattedDate();
//        customDateTime.addSeconds(60);
//        customDateTime.getFormattedDate();
//        customDateTime.addSeconds(30);
//        customDateTime.getFormattedDate();
//        customDateTime.addSeconds(0);
//        customDateTime.getFormattedDate();

        customDateTime.addSeconds(0);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(1);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(30);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(59);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(60);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(61);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(120);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(3599);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(3600);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(0);
        customDateTime.getFormattedDate();
        customDateTime.addSeconds(0);
        customDateTime.getFormattedDate();





        //customDateTime.ge
        //customDate.getFormattedDate();
        //customDate.validate(1,12,2020);
    }
}
