package javaCore.lesson1.obstacles;

import javaCore.lesson1.participants.Participant;

/**
 * Created by AlexBS on 26.02.2018.
 */
public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public void doIt(Participant p) {
        p.jump(height);
    }
}
