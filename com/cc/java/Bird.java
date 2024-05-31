package com.cc.java;

public class Bird implements Flyable, IFeathers{

    

    @Override
    public String hasFeathers() {
        return "I h4z f34th3r5!";
    }

    @Override
    public String fly() {
        return "I can fly at 20mph!";
    }

}
