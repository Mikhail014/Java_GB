package HW4;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Task2 {
    public static void main(String[] args) {
        List<Integer> listNums = new LinkedList<>();
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

    // Добавляет указанный элемент в конец этого списка
    public static void EnQueue(List<Integer> list, Integer elem){
        list.add(elem);
    }

    // Удаляет элемент в указанной позиции в этом списке.
    // Сдвигает любые последующие элементы влево (вычитает единицу из их индексов).
    // Возвращает элемент, который был удален из списка.
    public static Integer DeQueue(List<Integer> list){
        return list.remove(0);
    }

    // Возвращает элемент в указанной позиции в этом списке.
    public static Integer First(List<Integer> list){
        return list.get(0);
    }


    public static void PrintList(List<Integer> list){
        for (Integer item: list){
            System.out.print(item + " ");
        }
        System.out.println();
    }

}
