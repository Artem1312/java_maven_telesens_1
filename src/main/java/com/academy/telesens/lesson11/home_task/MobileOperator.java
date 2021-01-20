package com.academy.telesens.lesson11.home_task;

public enum MobileOperator {

    LIFE("38063","38093","38073"),
    KIEVSTAR("38097","38067","38098"),
    VODAFONE("38050","38066","38095");

    private String index1;
    private String index2;
    private String index3;

    MobileOperator(String index1, String index2, String index3) {
        this.index1 = index1;
        this.index2 = index2;
        this.index3 = index3;
    }

    public String getFirstIndex() {
        return index1;
    }
    public String getSecondIndex() {
        return index2;
    }
    public String getThirdIndex() {
        return index3;
    }
}
