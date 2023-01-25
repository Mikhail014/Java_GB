package HW1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Введите число: ");
        int num = EnterNum();
        while (num < 1){
            System.out.print("Пожалуйста, введите положительное число: ");
            num = EnterNum();
        }
        System.out.println("Сумма чисел от 1 до " + num + " = " + TriangularNumber(num));
        System.out.println("Факториал числа " + num + " = " + Factorial(num));
    }

    public static int EnterNum() {
        Scanner isScanner = new Scanner(System.in);
        return isScanner.nextInt();
    }

    public static int TriangularNumber(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res += i;
        }
        return res;
    }

    public static int Factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

}
