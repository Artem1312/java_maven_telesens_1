package com.academy.telesens.CustomeDate;

public enum NameOfMonth {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULE,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static String format(int month ){
        String nameOfMonth="";
        for(NameOfMonth name: values()){
            if(name.ordinal()+1 == month){
                nameOfMonth = name.name();
            }
        }
        return nameOfMonth;
    }
}
