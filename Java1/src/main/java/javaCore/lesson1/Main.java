package javaCore.lesson1;

import javaCore.lesson1.obstacles.Cross;
import javaCore.lesson1.obstacles.Obstacle;
import javaCore.lesson1.obstacles.Wall;
import javaCore.lesson1.obstacles.Water;
import javaCore.lesson1.participants.*;

/**
 * Created by AlexBS on 26.02.2018.
 */
public class Main {
    public static void main(String[] args) {

        // Создаем полосу препятствий
        Course c = new Course(new Obstacle[] {new Cross(100), new Wall(10), new Water(5)});

         // Создаем команду
        Team team = new Team("Participants", new Participant[] {new Cat("Barsik"), new Dog("Bobik"), new Human("Bob")});

        team.showName();
        c.doIt(team); // Просим команду пройти полосу
        team.showResults(); // Показываем результаты
    }
}
