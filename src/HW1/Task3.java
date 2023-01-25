package HW1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        while (true) {
            System.out.println("\nВыберите действие: \n");
            System.out.println("1) Сложение;");
            System.out.println("2) Вычитание;");
            System.out.println("3) Умножение;");
            System.out.println("4) Деление;");
            System.out.println("Любое другое число) Выход;\n");
            System.out.print("Введите число: ");
            int choice = EnterNum();

            if (choice < 1 || choice > 4){
                System.out.println("Вы вышли из программы! Удачи!");
                break;
            }

            System.out.print("Введите первое число: ");
            int num1 = EnterNum();

            System.out.print("Введите второе число: ");
            int num2 = EnterNum();

            if (choice == 1) {
                System.out.println("\nРезультат: " + num1 + " + " + num2 + " = " + Sum(num1, num2));
            }
            else if (choice == 2){
                System.out.println("\nРезультат: " + num1 + " - " + num2 + " = " + Sub(num1, num2));
            }
            else if (choice == 3){
                System.out.println("\nРезультат: " + num1 + " * " + num2 + " = " + Mul(num1, num2));
            }
            else if (choice == 4){
                System.out.println("\nРезультат: " + num1 + " / " + num2 + " = " + Div(num1, num2));
            }

        }
    }

    public static int EnterNum() {
        Scanner isScanner = new Scanner(System.in);
        return isScanner.nextInt();
    }

    public static int Sum(int n1, int n2) {
        return n1 + n2;
    }

    public static int Sub(int n1, int n2) {
        return n1 - n2;
    }

    public static int Mul(int n1, int n2) {
        return n1 * n2;
    }

    public static float Div(int n1, int n2) {
        return (float)n1 / (float)n2;
    }

}
