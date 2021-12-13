package com.example.oop;

import androidx.annotation.NonNull;

public class Vehicle extends Object{

      public String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    @Override
    public String toString() {
        return String.format("%s %s","Name:",getName());
    }
}


//inheritance
