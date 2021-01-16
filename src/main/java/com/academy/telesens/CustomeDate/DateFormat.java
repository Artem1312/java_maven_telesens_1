package com.academy.telesens.CustomeDate;

public enum DateFormat {
    RU,
    USA,
    ENG,
    UK,
    CUSTOM;

    @Override
    public String toString() {
        return "DateFormat{}";
    }

    public String format(int day, int month, int year) {
        String date = "";
        switch (this){
            case RU:                                                        //RU Россия DD.MM.YYYY	24.01.2011
                date = String.format("%02d.%02d.%04d", day, month, year);
                break;
            case UK:                                                        //UKВеликобритания	DD/MM/YYYY	24/01/2011
                date = String.format("%02d/%02d/%04d", day, month, year);
                break;
            case ENG:                                                       //ENG	Международный английский DD-MM-YYYY	24-01-2011
                date = String.format("%02d-%02d-%04d", day, month, year);
                break;
            case USA:                                                       //USA США	MM-DD-YYYY	01-24-2011
                date = String.format("%02d-%02d-%04d", month, day, year);
                break;
            case CUSTOM: //CUSTOM Пользовательский	DD <Название месяца> YYYYг	25 января 2011г
                date = String.format("%02d %s %04d", day, NameOfMonth.format(month), year);
                break;
            default:
                break;
        }
        return date;
    }
}
