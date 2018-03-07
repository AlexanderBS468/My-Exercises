package javaCore.lesson1.obstacles;

import javaCore.lesson1.participants.Participant;

/**
 * Created by AlexBS on 26.02.2018.
 */
public class Cross extends Obstacle {
    private int length;

    public Cross(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant p) {
        p.run(length);
    }
}
