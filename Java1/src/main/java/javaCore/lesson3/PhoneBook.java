package javaCore.lesson3;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by AlexBS on 05.03.2018.
 */
public class PhoneBook {
    public Map<String, String> pb;

    public PhoneBook() {
        pb = new LinkedHashMap<>();
    }

    public void add(String name, String phone){
        pb.put(name, phone);
    }

    public String get(String name){
        return name + ": " + pb.get(name);
    }
}
