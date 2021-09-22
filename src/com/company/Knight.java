package com.company;

public class Knight extends Character{

    public Knight() {
        super(new SwordBehavior());
    }

    @Override
    void display() {
        System.out.println("I am Knight. I will protect my King and Queen!");
    }
}
