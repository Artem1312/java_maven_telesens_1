package com.academy.telesens.lesson_09.home_task;

import com.academy.telesens.CustomeDate.CustomDate;

public class DemoIllegalDateException {

    public static void main(String[] args) {
        System.out.println("\nПозитивные кейсы:");
        CustomDate customDate1 = new CustomDate(2012,1,1);
        CustomDate customDate2 = new CustomDate(2019,2,17);
        CustomDate customDate3 = new CustomDate(2020,2,29);
        CustomDate customDate4 = new CustomDate(1999,1,31);
        CustomDate customDate5 = new CustomDate(1681,6,13);

        customDate1.getFormattedDate();
        customDate2.getFormattedDate();
        customDate3.getFormattedDate();
        customDate4.getFormattedDate();
        customDate5.getFormattedDate();

        System.out.println("\nНегативные кейсы:");
        CustomDate customDate6 = new CustomDate(2012,1,-1);     // отрицательный день
        CustomDate customDate7 = new CustomDate(2019,2,31);     // большое значение для дня
        CustomDate customDate8 = new CustomDate(2019,2,29);     // не высокосный год
        CustomDate customDate9 = new CustomDate(1999,13,31);    // 13 месяца не существует
        CustomDate customDate10 = new CustomDate(1681,6,0);     // нулевого дня не существует

        customDate6.getFormattedDate();
        customDate7.getFormattedDate();
        customDate8.getFormattedDate();
        customDate9.getFormattedDate();
        customDate10.getFormattedDate();
    }
}
