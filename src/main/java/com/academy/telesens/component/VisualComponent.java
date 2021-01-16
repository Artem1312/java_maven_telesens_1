package com.academy.telesens.component;

public interface VisualComponent {
    void draw();

    default void draw3D() { }


}
