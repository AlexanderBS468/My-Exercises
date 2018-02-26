package javaCore.obstacles;

import javaCore.participants.Animal;
import javaCore.participants.Participant;

/**
 * Created by AlexBS on 26.02.2018.
 */
public class Water extends Obstacle {
    private int length;

    public Water(int length) {
        this.length = length;
    }

    @Override
    public void doIt(Participant p) {
        p.swim(length);
    }
}
