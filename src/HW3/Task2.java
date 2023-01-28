package HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
        AddRandomNums(list, 10);
        System.out.print("Оригинальный список: ");
        PrintList(list);
        System.out.println();
        DeleteEvenNumsFromList(list);
        System.out.print("Список с нечетными числами: ");
        PrintList(list);
    }

    public static void DeleteEvenNumsFromList(List<Integer> list){
        int i = 0;
        while (i < list.size()) {
            if (list.get(i) % 2 == 0){
                list.remove(i);
                continue;
            }
            i++;
        }
    }

    public static void PrintList(List<Integer> list){
        for (Integer item: list){
            System.out.print(item + " ");
        }
    }

    public static void AddRandomNums(List<Integer> list, int count){
        Random r = new Random();
        for (int i = 0; i < count; i++) {
            list.add(r.nextInt(10));
        }
    }

}
