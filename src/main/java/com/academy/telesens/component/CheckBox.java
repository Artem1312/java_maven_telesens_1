package com.academy.telesens.component;

public class CheckBox extends Button{
    protected Boolean checked;

    public CheckBox(String text) {
        super(text);
    }

    public CheckBox() {

    }
//    public void draw() {
//
//    }
//    public void click() {
//
//    }


    @Override
    public void draw() {
        System.out.println("CheckBox: draw");
        //super.draw();
    }

    @Override
    public void draw3D() {
        //super.draw3D();
        System.out.println("CheckBox: draw3D");
    }

    @Override
    public void setxPosition() {
        super.setxPosition();
    }

    @Override
    public void setyPosition() {
        super.setyPosition();
    }

    @Override
    public void setWidth() {
        super.setWidth();
    }

    @Override
    public void setHeight() {
        super.setHeight();
    }

    @Override
    public void setText() {
        super.setText();
    }

    @Override
    public void getxPosition() {
        super.getxPosition();
    }

    @Override
    public void getyPosition() {
        super.getyPosition();
    }

    @Override
    public void getwidth() {
        super.getwidth();
    }

    @Override
    public void getheight() {
        super.getheight();
    }

    @Override
    public void gettext() {
        super.gettext();
    }

    @Override
    public void click() {
        super.click();
    }

    @Override
    public String toString() {
        return super.toString();
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

    public Boolean getChecked() { return checked; }

    public void setChecked(Boolean checked) { this.checked = checked; }
    public boolean isChecked() {
        return checked;
    }
}
