package javaCore.lesson5;

import java.util.Arrays;

/**
 * Created by AlexBS on 15.03.2018.
 */
public class MyThread extends Thread {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];
    float[] a1 = new float[size];
    float[] a2 = new float[size];

    public void doWithoutThreads() {
        Arrays.fill(arr, 1);
        long t = System.currentTimeMillis();
        for (int i = 0; i < size; i++)
            arr[i] = (float)(arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        System.out.println("Method #1 without threads: " + (System.currentTimeMillis() - t));
    }

    void doWithThreads() {
        Arrays.fill(arr, 1);
        long t = System.currentTimeMillis();
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);
        Thread one = new Thread(this, "one");
        Thread two = new Thread(this, "two");
        one.start();
        two.start();
        try {
            one.join();
            two.join();
        } catch (InterruptedException ex) { }
        System.arraycopy(a1, 0, arr, 0, h);
        System.arraycopy(a2, 0, arr, h, h);
        System.out.println("Method #2 with threads " + (System.currentTimeMillis() - t));
    }

    @Override
    public void run() {
        for (int i = 0; i < h; i++)
            if (Thread.currentThread().getName() == "one")
                a1[i] = (float)(a1[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
            else
                a2[i] = (float)(a2[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
    }
}
