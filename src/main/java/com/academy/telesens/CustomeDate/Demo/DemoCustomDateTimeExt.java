package com.academy.telesens.CustomeDate.Demo;

import com.academy.telesens.CustomeDate.CustomDateTime;
import com.academy.telesens.CustomeDate.CustomDateTimeExt;

public class DemoCustomDateTimeExt {
    public static void main(String[] args) {
        //конструкторы
        CustomDateTimeExt customDateTimeExt = new CustomDateTimeExt();
        CustomDateTimeExt customDateTimeExt1 = new CustomDateTimeExt(2020, 12, 15, 15, 45, 25, 899);
        //customDateTimeExt1.getFormattedDate();
        CustomDateTimeExt customDateTimeExt2 = new CustomDateTimeExt(customDateTimeExt1 );
        CustomDateTime customDateTime = new CustomDateTime(2020, 12, 12, 15, 15, 15);
        CustomDateTime customDateTime1 = new CustomDateTime(customDateTime);


        customDateTimeExt.getFormattedDate();
        customDateTimeExt.setMs(123);
        customDateTimeExt.getFormattedDate();
        customDateTime.getFormattedDate();
        System.out.println(customDateTime.equals(customDateTime1));
        //- метод toString()
        System.out.println("****Проверки****");
        customDateTimeExt.getFormattedDate();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt2.getFormattedDate();
        //метод equals()
        System.out.println("equals()");
        System.out.println(customDateTimeExt2.equals(customDateTimeExt1));
        System.out.println(customDateTimeExt2.equals(customDateTimeExt));
        System.out.println("next...()");
        customDateTimeExt1.nextSecond();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt1.nextMinute();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt1.nextHour();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt1.nextDay();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt1.nextMonth();
        customDateTimeExt1.getFormattedDate();
        customDateTimeExt1.nextYear();
        customDateTimeExt1.getFormattedDate();

        customDateTime.setHour(25);
        customDateTime.getFormattedDate();

        customDateTimeExt.checkData();
        customDateTimeExt.checkTime();

    }
}
