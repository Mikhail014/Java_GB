package Lessons;

import java.util.HashMap;
import java.util.Map;

public class Seminar5 {
    public static void main(String[] args) {
        Map<Integer, String> db = new HashMap<>();
        db.put(1, "a");
        db.put(2, "b");
        db.put(3, "c");
        db.put(4, "d");
        for (var item: db.entrySet()){
            System.out.println(item.getKey() + ": " + item.getValue());
        }
    }
}
