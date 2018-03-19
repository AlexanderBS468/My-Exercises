package javaCore.lesson5;

/**
 * Created by AlexBS on 15.03.2018.
 */
public class Main {

    public static void main(String[] args) {
        MyThread t1 = new MyThread();

        t1.doWithoutThreads();

        t1.doWithThreads();
    }
}
