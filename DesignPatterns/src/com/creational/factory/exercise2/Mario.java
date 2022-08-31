package com.creational.factory.exercise2;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class Mario {

    private final String name;
    private final int jumpAttack = 10;
    private final int mushroomAttack = 20;
    private int health = 100;

    public Mario(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getJumpAttack() {
        return jumpAttack;
    }

    public int getMushroomAttack() {
        return mushroomAttack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
