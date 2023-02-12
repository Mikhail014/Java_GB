package HW6;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Notebook n1 = new Notebook("Asus", 8, 256, "Windows 11", "Красный", "Intel Core i7", 59_999);
        Notebook n2 = new Notebook("Huawei", 8, 512, "Windows 11", "Серый", "Rayzen 7", 74_599);
        Notebook n3 = new Notebook("MacBook", 8, 512, "MacOs", "Темносерый", "Apple M1", 119_999);
        Notebook n4 = new Notebook("MSI", 16, 512, "Windows 11", "Черный", "Rayzen 9", 129_999);
        Notebook n5 = new Notebook("Dell", 4, 128, "Windows 10", "Белый", "Intel Core i3", 24_599);

        HashSet<Notebook> notebooks = new HashSet<>();
        notebooks.add(n1);
        notebooks.add(n2);
        notebooks.add(n3);
        notebooks.add(n4);
        notebooks.add(n5);

        System.out.println("-----------------------------");
        System.out.println("Выбор ноутбуков:");
        System.out.println("-----------------------------");
        PrintSet(notebooks);
        OutputByCriterion(notebooks);
    }

    public static void PrintSet(HashSet<Notebook> set){
        System.out.println();
        for (Notebook el: set){
            System.out.println(el);
        }
        System.out.println();
    }

    public static int GetInputInt(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void OutputByCriterion(HashSet<Notebook> set){
        HashMap<Integer, String> criteria = new HashMap<>();
        criteria.put(1, "Оперативная память");
        criteria.put(2, "Объем памяти (SSD)");
        criteria.put(3, "Операционная система");
        criteria.put(4, "Процессор");
        criteria.put(5, "Цвет");
        criteria.put(6, "Цена");
        System.out.println();
        System.out.println("Выберите критерий:");
        for (var el: criteria.entrySet()){
            System.out.println(el.getKey() + ": " + el.getValue());
        }
        System.out.print("Ответ: ");
        System.out.println();
        int choice = GetInputInt();
        while (choice < 1 || choice > 6) {
            System.out.print("Ошибка! Введите число от 1 до 5: ");
            choice = GetInputInt();
        }

        System.out.println();
        System.out.println("Имя | " + criteria.get(choice));
        System.out.println("---------------");
        for (Notebook el: set){
            if (choice == 1) {
                System.out.println(el.name + " | " + el.ram + " ГБ");
            } else if (choice == 2) {
                System.out.println(el.name + " | " + el.memory + " ГБ");
            } else if (choice == 3) {
                System.out.println(el.name + " | " + el.os);
            } else if (choice == 4) {
                System.out.println(el.name + " | " + el.cpu);
            } else if (choice == 5) {
                System.out.println(el.name + " | " + el.color);
            } else {
                System.out.println(el.name + " | " + el.price + " рублей");
            }

        }
        System.out.println();
    }

}
