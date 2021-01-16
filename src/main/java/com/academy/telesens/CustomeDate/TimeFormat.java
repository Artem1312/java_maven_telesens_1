package com.academy.telesens.CustomeDate;

public enum TimeFormat {
    H12, //H12		12 часовой			HH:MM:SS (am|pm)	09:23:45am, 09:23:45pm
    H24; //H24		24 часовой			HH:MM:SS			09:23:45,	21:23:45

    @Override
    public String toString() {
        return "TimeFormat{}";
    }

    public String format(int hour, int minute, int second){
        String time ="";
        switch (this){
            case H12:
                if(hour<=12){
                    time = String.format("%d:%02d:%02d a.m.", hour, minute, second);
                }else{
                    time = String.format("%d:%02d:%02d p.m.", hour-12, minute, second);
                }
                break;
            case H24:
                time = String.format("%02d:%02d:%02d", hour, minute, second);
                break;
            default:
                break;
        }
        return time;
    }
}
