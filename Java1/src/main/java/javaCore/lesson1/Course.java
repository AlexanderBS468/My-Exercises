package javaCore.lesson1;

import javaCore.lesson1.obstacles.Obstacle;


/**
 * Created by AlexBS on 26.02.2018.
 */
public class Course {
    Obstacle[] obstacles;

    public Course(Obstacle[] obstacles) {
        this.obstacles = new Obstacle[obstacles.length];
        this.obstacles = obstacles;
    }

    public void doIt(Team team) {
        for (Obstacle obstacle : obstacles)
            team.doIt(obstacle);
    }
}
