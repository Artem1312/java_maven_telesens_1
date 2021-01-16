package com.academy.telesens.component;

public class Label extends Component {

    public Label(String text) {
        super(text);
    }

    public Label() {

    }

    @Override
    public void draw() {
        System.out.println("Label: draw");
        info();
    }

    @Override
    public void draw3D() {
        //super.draw3D();
        System.out.println("Label: draw3D");
    }

    public void info(){
        gettext();
        getxPosition();
        getyPosition();
        getheight();
        getwidth();
    }

    @Override
    public void setxPosition() {

    }

    @Override
    public void setyPosition() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public void setHeight() {

    }

    @Override
    public void setText() {

    }

    @Override
    public void getxPosition() {

    }

    @Override
    public void getyPosition() {

    }

    @Override
    public void getwidth() {

    }

    @Override
    public void getheight() {

    }

    @Override
    public void gettext() {

    }
}
