package com.company;

public class Troll extends Character{
    public Troll() {
        super(new BowAndArrowBehavior());
    }

    @Override
    void display() {
        System.out.println("What are you doing in my swamp?!");
    }
}
