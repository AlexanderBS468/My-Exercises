package javaCore.lesson3;

import java.util.*;

/**
 * Created by AlexBS on 05.03.2018.
 */
public class Main {
    public static void main(String[] args) {
        String text = "Lorem ipsum dolor sit amet, consectetur adipisicing elit. Cum quas, beatae nihil asperiores " +
                "rem ipsum, placeat ab earum nulla omnis fugit assumenda labore Lorem ipsum dolor sit amet.";
        task(text);
        phoneBook();
    }


    private static void task(String str) {
        ArrayList<String> data = new ArrayList<String>();
        Integer value;
        String[] words = str.split("[ ,.]+");
        Map<String, Integer> lhm = new LinkedHashMap<>();
        for (String word : words) {
            value = lhm.get(word);
            lhm.put(word, ((value == null)? 1 : value + 1));
        }
        for (String word : words) {
            if (lhm.get(word) == 1) {
                data.add(word);
            }
        }
        System.out.println("counted words: \n" + lhm);
        System.out.println("list of unique words:\n" + data);
        }

    private static void phoneBook() {
        PhoneBook pb = new PhoneBook();
        pb.add("Ivanov","12345");
        pb.add("Sidorov","123456");
        pb.add("Ivanov","123456789");
        System.out.println(pb.get("Ivanov"));
    }
}
