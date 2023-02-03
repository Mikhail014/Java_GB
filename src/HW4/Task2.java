package HW4;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        Queue<Integer> listNums = new LinkedList<>();
        listNums.add(1);
        listNums.add(2);
        listNums.add(3);
        listNums.add(4);
        listNums.add(5);
        System.out.print("Исходный список: ");
        PrintList(listNums);
        EnQueue(listNums, 6);
        System.out.print("Добавлен элемент в конец: ");
        PrintList(listNums);
        int dq = DeQueue(listNums);
        System.out.print("Извлеченный первый элемент: ");
        System.out.println(dq);
        System.out.print("Обновленный список: ");
        PrintList(listNums);
        int f = First(listNums);
        System.out.print("Неизвлеченный первый элемент: ");
        System.out.println(f);
        System.out.print("Обновленный список: ");
        PrintList(listNums);
    }

    public static void EnQueue(Queue<Integer> list, Integer elem){
        list.add(elem);
    }

    public static Integer DeQueue(Queue<Integer> list){
        return list.remove();
    }
    public static Integer First(Queue<Integer> list){
        return list.element();
    }


    public static void PrintList(Queue<Integer> list){
        for (Integer item: list){
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
