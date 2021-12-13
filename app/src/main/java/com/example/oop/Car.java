package com.example.oop;

public class Car {

    private String enginetype;
    private String name;


    public Car(String enginetype, String name) {
        this.enginetype = enginetype;
        this.name = name;
    }

    @Override
    public String toString() {
        String s = "Car:" + name + ",enginetype:" + enginetype;
        return s;
    }
}

//encapsulation
