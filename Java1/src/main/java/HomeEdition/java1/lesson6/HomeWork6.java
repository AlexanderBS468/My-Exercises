package HomeEdition.java1.lesson6;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by AlexBS on 04.02.2018.
 */
public class HomeWork6 {
    /**
     * 1. Создать 2 текстовых файла, примерно по 50-100 символов в каждом(особого значения не имеет);
     * 2. Написать программу, «склеивающую» эти файлы, то есть вначале идет текст из первого файла, потом текст из второго.
     * 3.* Написать программу, которая проверяет присутствует ли указанное пользователем слово в файле.
     * 4.** Написать метод, проверяющий, есть ли указанное слово в папке
     */
    public static void methodWrite(String name, int k) {
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        try {
            PrintStream ps = new PrintStream(new FileOutputStream(name, true));
            FileOutputStream fos = new FileOutputStream(name, true);
            ps.println("Hi. This is the first use for writing to a file: " + name);
            switch (k) {
                case 1: {
                    for (int i = 1; i < 51; i++) {
                        ps.println("This " + i + " line.");
                    }
                    ps.flush();
                    ps.close();
                }
                break;
                case 2: {
                    for (int i = 1; i < 20; i++) {
                        for (int j = 1; j < 50; j++) {
                        ps.print(str.charAt((int) (Math.random()*str.length()))); }
                        ps.println();
                    }
                    ps.flush();
                    ps.close();
                }
                break;
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }

    public static void methodJoin(String name, String name3) {
        try {
            Scanner sc = new Scanner(new FileInputStream(name));
            PrintStream ps = new PrintStream(new FileOutputStream(name3, true));
            while (sc.hasNext()) { ps.println(sc.nextLine()); }
            ps.flush();
            ps.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
    public static String methodFind(String name, String str) {
        try {
            FileInputStream fis = new FileInputStream(name);
            int b,j = 0;
            StringBuffer result = new StringBuffer();
            while ((b = fis.read()) != -1) {
                for (int i = j; i < str.length(); i++) {
                    if ((char)b == str.charAt(i)) {
                            result.append((char)b);
                            j++;
                            break;
                        }
                    }
                }
            if (str.equals(result.toString())) return str = "Found";
        } catch (FileNotFoundException e) {
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str = "Not Found";
    }

    public static void main (String[] args) {
        methodWrite("text.txt", 1);
        methodWrite("text#2.txt", 2);
        methodJoin("text.txt",  "text_join.txt");
        methodJoin("text#2.txt",  "text_join.txt");
        System.out.println(methodFind("text.txt", "30"));
    }
}
