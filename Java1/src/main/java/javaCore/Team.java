package javaCore;

import javaCore.obstacles.Obstacle;
import javaCore.participants.Participant;

import java.util.Arrays;

/**
 * Created by AlexBS on 26.02.2018.
 */
public class Team {

    private String name;
    private String result;
    private Participant[] participants;

    public Team(String name, Participant[] participants) {
        this.name = name;
        this.participants = new Participant[participants.length];
        this.participants = participants;
        result = "";
    }


    public void doIt(Obstacle obstacle) {
        for (Participant p : participants) {
            obstacle.doIt(p);
        }
    }

    public void showResults() {
        System.out.println("RESULTS:");
        for (Participant p : participants) {
            p.info();
        }
    }

    public void showName() {
        System.out.println("Team name: " + this.name + "; command structure: " + Arrays.toString(participants));
    }
}
