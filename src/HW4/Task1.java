package HW4;

import java.util.LinkedList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> listNums = new LinkedList<>();
        listNums.add(1);
        listNums.add(2);
        listNums.add(3);
        listNums.add(4);
        listNums.add(5);
        System.out.print("Исходный список: ");
        PrintList(listNums);
        System.out.println();
        ReverseList(listNums);
        System.out.print("Перевернутый список: ");
        PrintList(listNums);
    }

    public static void ReverseList(LinkedList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.add(i, list.pollLast());
        }
    }

    public static void PrintList(LinkedList<Integer> list){
        for (Integer item: list){
            System.out.print(item + " ");
        }
    }
}
