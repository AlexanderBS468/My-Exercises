package javaCore.participants;

/**
 * Created by AlexBS on 26.02.2018.
 */
public interface Participant {
    void run(int distance);
    void jump(int height);
    void swim(int distance);
    boolean isOnDistance();
    void info();
}
