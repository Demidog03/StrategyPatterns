package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Character character = new Queen();

        character.display();
        character.fight();

        character.setWeaponBehavior(new BowAndArrowBehavior());
        character.fight();

    }
}
