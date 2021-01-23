package com.academy.telesens.lesson_10.generic.from_lesson;

public class Generic<T, S> {
    T firstElement;
    S secondElement;

    public void setFirstElement(T element){
        firstElement = element;
    }

    public void setSecondElement(S element){
        secondElement = element;
    }

    public T getFirstElement() {
        return firstElement;
    }

    public S getSecondElement() {
        return secondElement;
    }
}


