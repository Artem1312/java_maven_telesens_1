package com.academy.telesens.Operator;

import java.util.Objects;

public class Operator {
    //поля
    private String name = "Vodafon";
    private String address = "Kiev";

    //конструкторы
    //признаки конструуктора: название класа должно совпадать с методом и нет возвращаемого значения
    public Operator() {
    }

    public Operator(String name, String address) {
        this.name = name;
        this.address = address;
    }
    //setter getter
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    @Override
    public String toString() {
        return "Operator{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operator operator = (Operator) o;
        return name.equals(operator.name) &&
                address.equals(operator.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, address);
    }
}
