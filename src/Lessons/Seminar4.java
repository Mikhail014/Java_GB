package Lessons;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Seminar4 {
    public static void main(String[] args) {
        String input = ReadConsole();
        String[] splitInput = input.split("~");
        PrintArr(splitInput);
    }

    public static String ReadConsole(){
        Scanner iScanner = new Scanner(System.in);
        return iScanner.nextLine();
    }

    public static void PrintArr(String[] arr){
        for (String item: arr){
            System.out.println(item);
        }
    }
}




//        List<Integer> list1 = new ArrayList<>();
//        List<Integer> list2 = new LinkedList<>();
//
//        long start = System.nanoTime();
//        for (int i = 0; i < 1000000; i++) {
//            list2.add(i);
//        }
//        long end = System.nanoTime();
//        System.out.println(end - start);