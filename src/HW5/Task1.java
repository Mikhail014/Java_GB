package HW5;

import java.util.HashMap;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, String> phonebook = new HashMap<>();
        while (true) {
            System.out.print("Введите номер телефона: ");
            String numPhone = Input();
            System.out.print("Введите имя владельца номера: ");
            String name = Input();
            phonebook.put(numPhone, name);
            PrintMap(phonebook);
        }
    }

    public static void PrintMap(HashMap<String, String> hashMap){
        System.out.println();
        for (var el: hashMap.entrySet()){
            System.out.println(el.getKey() + ": " + el.getValue());
        }
        System.out.println();
    }

    public static String Input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
