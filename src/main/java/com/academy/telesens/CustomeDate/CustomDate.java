package com.academy.telesens.CustomeDate;

import com.academy.telesens.lesson_09.home_task.IllegalDateException;
import com.academy.telesens.lesson_09.home_task.IsZeroDayException;
import com.academy.telesens.lesson_09.home_task.NegativeValueDayException;

import java.util.Scanner;

public class CustomDate {
    private int day = 1;
    private int month = 1;
    private int year = 2000;
    public DateFormat format;
    public NameOfMonth namMonth;
    /*
    b) Модифицировать класс CustomDate, добавив в конструктор
		выбрасывания исключения IllegalDateException при
		попытки создать некорректную (не существующую дату)
     */
    public CustomDate(int year, int month, int day) {
        //this.year = year;
        //this.month = month;
        //this.day = day;

        try {
            setYear(year);
        } catch (IllegalDateException exc){
            System.err.println("Вы ввели неправильный год");
        } catch (Exception e) {
            System.err.println("Unknown error");
        }

        try {
            setMonth(month);
        } catch (IllegalDateException exc){
            System.err.println("Вы ввели несуществующий месяц");
        } catch (Exception e) {
            System.err.println("Unknown error");
        }

        try {
            setDay(day);
        } catch (NegativeValueDayException nd) {
            System.err.println("Не существует день с отрицательным значением");
        } catch (IsZeroDayException zd) {
            System.err.println("Не существует нулевой день");
        } catch (IllegalDateException exc) {
            System.err.println("Вы ввели несуществующий день месяца");
        } catch (Exception e) {
            System.err.println("Unknown error");
        }
    }

    public CustomDate() {

    }

    public void setDay(int day) throws RuntimeException {
        if (0 > day) {
            throw new NegativeValueDayException();
        } else if (day==0) {
            throw new IsZeroDayException();
        }
        else if (!validate(day,this.month, this.year)) {
            throw new IllegalDateException();
        }
        else{
            this.day = day;
        }
    }

    public void setMonth(int month) throws IllegalDateException {

        if(!validate(this.day,month,this.year)){
            throw new IllegalDateException();
        } else {
            this.month = month;
        }

    }

    public void setYear(int year) throws IllegalDateException {
        if(year < 0)
            throw new IllegalDateException();
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String nameOfDay(){
        int number = dayOfWeek(this.day,this.month,this.year);
        String nameOfDay="";
        switch (number){
            case 1:
                nameOfDay = "Понедельник";
                break;
            case 2:
                nameOfDay = "Вторник";
                break;
            case 3:
                nameOfDay = "Среда";
                break;
            case 4:
                nameOfDay = "Четверг";
                break;
            case 5:
                nameOfDay = "Пятница";
                break;
            case 6:
                nameOfDay = "Суббота";
                break;
            case 7:
                nameOfDay = "Воскресенье";
                break;
        }
        return nameOfDay;
    }

    public String getFormattedDate(){
        DateFormat dateFormat = DateFormat.RU;

        String formatDate;
        String date2;
        String date;
        //date = ""+getDay()+"."+getMonth()+"."+getYear()+" "+nameOfDay;
        //date = String.format("%02d.%02d.%04d %s",getDay(),getMonth(),getYear(),nameOfDay());
        formatDate = dateFormat.format(getDay(),getMonth(),getYear());
        String dayOfWeek = String.format("%s",nameOfDay());
        date = formatDate + " "+dayOfWeek;
        //System.out.println(String.format("%02d. %02d. %04d %s",getDay(),getMonth(),getYear(),nameOfDay));
        System.out.println(date);
        return date;
    }

    public String getFormattedDate(DateFormat format){

        String date;
        String formatDate;

//        date = ""+getDay()+"."+getMonth()+"."+getYear()+" "+nameOfDay;
//        date = String.format("%02d.%02d.%04d %s",getDay(),getMonth(),getYear(),nameOfDay());
//        System.out.println(String.format("%02d. %02d. %04d %s",getDay(),getMonth(),getYear(),nameOfDay));

        formatDate = format.format(getDay(),getMonth(),getYear());
        String dayOfWeek = String.format("%s",nameOfDay());
        date = formatDate + " "+dayOfWeek;
        System.out.println(date);
        return date;
    }

    static boolean leapYear(int year){
        //проверка на высокосный год
        boolean leapYear;
        if (year%400 == 0 ){
            leapYear = true;
        } else if (year%100 == 0){
            leapYear = false;
        } else if (year%4 == 0){
            leapYear = true;
        } else {
            leapYear = false;
        }

        return leapYear;
    }

    static boolean validate(int day, int month, int year){

        boolean result;
        boolean existDay;
        boolean existMonth;
        boolean existYear = true;
        boolean leapYear = leapYear(year);

        //проверка что введен правильный месяц
        if(month>0 && month<13){
            existMonth = true;
        } else existMonth = false;

        //существующий день
        if((month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)&&(day>0&&day<=31)){
            existDay = true;
        } else if((month==4 || month==6 || month==9 || month==11)&&(day>0&&day<=30)){
            existDay = true;
        } else if(month==2 && leapYear==true &&(day>0&&day<=29)){
            existDay = true;
        } else if(month==2 && leapYear==false &&(day>0&&day<=28)){
            existDay = true;
        } else existDay = false;

        if(existDay&&existMonth&&existYear){
            result = true;
        } else result = false;

        //System.out.println(result);
        return result;
    }


    static boolean validateDay(int day){  //(для проверки дня, считаем что дней не может быть более 31)

        boolean result;
        boolean existDay;
        boolean existMonth=true;
        boolean existYear = true;

        if(day>0&&day<=31){
            existDay=true;
        } else {
            existDay=false;
        }

        if(existDay&&existMonth&&existYear){
            result = true;
        } else result = false;

        //System.out.println(result);
        return result;
    }

    static boolean validateMonth(int month){

        boolean result;
        boolean existDay=true;
        boolean existMonth;
        boolean existYear = true;

        //проверка что введен правильный месяц
        if(month>0 && month<13){
            existMonth = true;
        } else existMonth = false;

        if(existDay&&existMonth&&existYear){
            result = true;
        } else result = false;

        //System.out.println(result);
        return result;
    }

    public void nextDay(){
        int temp = this.day;
        temp++;
        if(temp == 32 && (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)){
            setDay(1);
            //setMonth(getMonth()+1);
            nextMonth();
        } else if(temp == 31 && (month==4 || month==6 || month==9 || month==11)){
            setDay(1);
            nextMonth();
        } else if(temp == 30 && month==2 && leapYear(this.year)==true){
            setDay(1);
            setMonth(3);
        } else if (temp == 29 && month==2 && leapYear(this.year)==false){
            setDay(1);
            setMonth(3);
        } else {setDay(temp);}
    }

    public void nextMonth(){
        int temp = this.month;
        temp++;
        if(temp>12){
            setMonth(1);
            nextYear();
        } else {setMonth(temp);}
    }

    public void nextYear(){
        setYear(getYear()+1);
    }

    static int dayOfWeek(int day, int month, int year){
        //алгоритм https://unotices.com/page-answer.php?id=46039
        int dayOfWeek; //понедельника - 0 вторника - 1 и т.д.
        if(month<=2){
            year=-1;
            day+=3;
        }
        dayOfWeek = 1 + (day+year+(year/4)-(year/100)+(year/400)+(31*month + 10)/12)%7;
        return dayOfWeek;
    }

    public void checkData(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите дату в формате дд:мм:гггг ");
        String userDate = scanner.nextLine();

        String[] arr = userDate.split("\\D+");
        int[] date = new int[3];
        for(int i=0;i<3;i++){
            date[i] = Integer.parseInt(arr[i]);
        }

        int day = date[0];
        int month = date[1];
        int year = date[2];

        if(validate(day,month,year)){
            System.out.println("Вы ввели действительную дату");
        } else {
            System.out.println("Вы ввели не действительную дату");
        }
    }
}
