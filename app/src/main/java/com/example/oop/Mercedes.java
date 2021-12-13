package com.example.oop;

public abstract class Mercedes {
    String s;

    public Mercedes(String s) {
        this.s = s;
    }
}
 class one extends Mercedes
 {
     @Override
     public String toString() {
         return "Mercedes:" + s;
     }

     public one(String s) {
         super(s);
     }
 }


 //abstraction