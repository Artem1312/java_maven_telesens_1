package com.academy.telesens.CustomeDate;

import static com.academy.telesens.CustomeDate.DateFormat.*;

public class DemoCustomDate {
    public static void main(String[] args) {
        CustomDate customDate = new CustomDate();
        CustomDateTime customDateTime = new CustomDateTime();
        customDate.setDay(1);
        customDate.setMonth(12);
        customDate.setYear(2020);

        System.out.println("Без атрибута (по дефолу RU)");
        customDate.getFormattedDate();
        System.out.println("format eng");
        customDate.getFormattedDate(ENG);
        System.out.println("format ru");
        customDate.getFormattedDate(RU);
        System.out.println("format usa");
        customDate.getFormattedDate(USA);
        System.out.println("format uk");
        customDate.getFormattedDate(UK);
        System.out.println("format custom");
        customDate.getFormattedDate(CUSTOM);
        //System.out.println(NameOfMonth.format(2));


        System.out.println("*********************************");
        customDateTime.setYear(2020);
        customDateTime.setMonth(12);
        customDateTime.setDay(21);
        customDateTime.setYear(2020);
        customDateTime.setHour(15);
        customDateTime.setMinute(32);
        customDateTime.setSecond(45);

        customDateTime.getFormattedDate(RU, TimeFormat.H12);
        customDateTime.getFormattedDate(ENG, TimeFormat.H12);
        customDateTime.getFormattedDate(UK, TimeFormat.H12);
        customDateTime.getFormattedDate(USA, TimeFormat.H12);
        customDateTime.getFormattedDate(CUSTOM, TimeFormat.H12);
        customDateTime.getFormattedDate(RU, TimeFormat.H24);
        customDateTime.getFormattedDate(ENG, TimeFormat.H24);
        customDateTime.getFormattedDate(UK, TimeFormat.H24);
        customDateTime.getFormattedDate(USA, TimeFormat.H24);
        customDateTime.getFormattedDate(CUSTOM, TimeFormat.H24);



        customDate.validate(1,12,2020);

    }
}
