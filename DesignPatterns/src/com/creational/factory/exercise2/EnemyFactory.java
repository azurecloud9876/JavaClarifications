package com.creational.factory.exercise2;

/**
 * @author khalil el maghraoui <khalil.elmaghraoui.1@gmail.com>
 * @created 12/20/2020.
 */
public class EnemyFactory {

    public static final int BIRD = 1;
    public static final int TURTLE = 2;
    public static final int DINOSAUR = 3;

    public static Enemy createEnemy(int id) {
        switch (id) {
            case BIRD:
                return new Bird();
            case TURTLE:
                return new Turtle();
            case DINOSAUR:
                return new Dinosaur();
            default:
                return null;
        }
    }
}
