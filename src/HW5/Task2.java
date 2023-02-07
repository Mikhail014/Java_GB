package HW5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task2 {
    public static void main(String[] args) {
        List<String> workers = new ArrayList<>();
        workers.add("Иван Иванов");
        workers.add("Олег Петров");
        workers.add("Иван Иванов");
        workers.add("Олег Петров");
        workers.add("Иван Иванов");
        workers.add("Иван Иванов");
        workers.add("Иван Иванов");
        workers.add("Иван Иванов");
        workers.add("Сергей Волков");
        workers.add("Сергей Волков");
        workers.add("Сергей Волков");
        workers.add("Сергей Волков");
        workers.add("Олег Петров");
        workers.add("Олег Петров");
        workers.add("Олег Петров");
        workers.add("Олег Петров");
        workers.add("Олег Петров");
        workers.add("Олег Петров");
        System.out.println("Список имен:");
        PrintList(workers);
        System.out.println("Количество повторений имен:");
        FindAndPrintDuplicateNames(workers);
    }

    public static void PrintList(List<String> list){
        for (String el: list){
            System.out.println(el);
        }
        System.out.println();
    }

    public static void FindAndPrintDuplicateNames(List<String> list){
        HashMap<String, Integer> names = new HashMap<>();
        for (String el: list){
            if (names.containsKey(el)){
                names.put(el, names.get(el) + 1);
            }
            else {
                names.put(el, 1);
            }
        }

        names.entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .forEach(el -> System.out.println(el.getKey() + ": " + el.getValue()));;
        System.out.println();
    }
}
