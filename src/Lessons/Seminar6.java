package Lessons;

import java.util.HashSet;

public class Seminar6 {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(2);
        hashSet.add(3);
        hashSet.add(3);
        System.out.println(hashSet);
    }
}
