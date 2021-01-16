package com.academy.telesens.lesson_05;

public class Buttn {
    //поля класа
    private int size;  //0
    String text;  // null

    //constuctor
    public Buttn(){
        System.out.println("Конструктор класа Buttn");
    }

    public Buttn(int size) {
        this.size = size;
    }

    public Buttn(int size, String text) {
        this.size = size;
        this.text = text;
    }

    //методы класа
    void setText(String text){
        this.text = text;
    }
    void init(){
        size = 20;
        text = "NoName";
    }
    void init(int size, String text){
        this.size = size;
        this.text = text;
    }

    public void setSize(){

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    void printnfo(){
        System.out.println(String.format("size: %d, text: %s", size, text));
    }
}
