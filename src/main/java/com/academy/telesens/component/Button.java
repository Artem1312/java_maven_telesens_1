package com.academy.telesens.component;

public class Button extends Component{

    public Button() {
    }

    public Button(String text) {
        super(text);
    }

    @Override
    public void draw3D() {
        //super.draw3D();
        System.out.println("Button: draw3D");
    }

    @Override
    public void draw() {
        System.out.println("Button: draw");
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

    public void click(){
        System.out.println("button was clicked");
    }

    @Override
    public String toString() {
        return "Button{" +
                "xPosition=" + xPosition +
                ", yPosition=" + yPosition +
                ", width=" + width +
                ", height=" + height +
                ", text='" + text + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }


}
