package HW3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        AddRandomNums(list, 10);
        System.out.print("Список: ");
        PrintList(list);
        System.out.println();
        System.out.print("Минимальное число: " + MinNumber(list) + "\n");
        System.out.print("Максимальное число: " + MaxNumber(list) + "\n");
        System.out.print("Среднее арифметическое число: " + AverageNumber(list) + "\n");
    }

    public static void PrintList(List<Integer> list){
        for (Integer item: list){
            System.out.print(item + " ");
        }
    }

    public static void AddRandomNums(List<Integer> list, int count){
        Random r = new Random();
        for (int i = 0; i < count; i++) {
            list.add(r.nextInt(100));
        }
    }

    public static int MinNumber(List<Integer> list) {
        int res = list.get(0);
        for (Integer num: list){
            if (num < res) {
                res = num;
            }
        }
        return res;
    }

    public static int MaxNumber(List<Integer> list) {
        int res = list.get(0);
        for (Integer num: list){
            if (num > res) {
                res = num;
            }
        }
        return res;
    }

    public static float AverageNumber(List<Integer> list) {
        int res = 0;
        for (Integer num: list){
            res += num;
        }
        return (float)res / list.size();
    }

}
