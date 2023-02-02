package Lessons;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Seminar3 {
    public static void main(String[] args) {
        String[] planets = new String[]{
                "Земля",
                "Марс",
                "Венера",
                "Земля",
                "Сатурн",
                "Юпитер",
                "Плутон",
                "Сатурн",
        };

        List<String> planetsList = ParseToList(planets);
        HashSet<String> countPlanets = NumberOfRepeatingValuesInList(planetsList);
        PrintSet(countPlanets);

    }

    public static void PrintSet(HashSet<String> set){
        for (String item: set){
            System.out.println(item);
        }
    }


    public static List<String> ParseToList(String[] arr){
        List<String> list = new ArrayList<>();
        for (String item: arr){
            list.add(item);
        }
        return list;
    }

    public static void PrintList(List<String> list){
        for (String item: list){
            System.out.print(item + " ");
        }
    }

    public static HashSet<String> NumberOfRepeatingValuesInList(List<String> list){
        list.sort(null);
        HashSet<String> unVal = new HashSet<>();
        for (String item1: list){
            int count = 0;
            for (String item2: list){
                if (item1 == item2){
                    count++;
                }
            }
            unVal.add(item1 + ": " + count);
        }
        return unVal;
    }

}






















//// Task 1

//    ArrayList<Integer> nums = new ArrayList<>();
//        int min = 0;
//        int max = 10;
//        Random random = new Random();
//        for (int i = 0; i < 10; i++) {
//            nums.add(random.nextInt(max - min) + min);
//        }
//
//        nums.sort(null);
//
//        for (Integer item: nums){
//            System.out.print(item + " ");
//        }