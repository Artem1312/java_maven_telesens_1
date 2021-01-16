package com.academy.telesens.component;

public class Demo {
    public static void main(String[] args) {

        Button button = new Button();
        Button button1 = new Button();
        Label label = new Label();
        Label label1 = new Label();
        RoundButton roundButton = new RoundButton();
        RoundButton roundButton1 = new RoundButton();
        CheckBox checkBox = new CheckBox();
        CheckBox checkBox1 = new CheckBox();

        System.out.println("Компоненты******");

        Component[] arr = {button, label, roundButton, checkBox, button1, label1, roundButton1, checkBox1};

        System.out.println("All elements");

        for(int i =0; i< arr.length; i++){
            arr[i].draw();
        }

        System.out.println("Button*****");

        for(int j=0;j<arr.length; j++){
            if(arr[j] instanceof Button){
                arr[j].draw();
            }
        }

        label.draw3D();
        button.draw3D();
        checkBox.draw3D();
        roundButton.draw3D();
    }
}
