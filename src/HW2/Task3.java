package HW2;

import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task3 {
    public static void main(String[] args) throws IOException {

        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("./src/HW2/log_calc.txt");
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        while (true) {
            System.out.println("\nВыберите действие: \n");
            System.out.println("1) Сложение;");
            System.out.println("2) Вычитание;");
            System.out.println("3) Умножение;");
            System.out.println("4) Деление;");
            System.out.println("Любое другое число) Выход;\n");
            System.out.print("Введите число: ");
            int choice = EnterNum();
            logger.info("Выбрано действие под цифрой " + choice);
            if (choice < 1 || choice > 4){
                System.out.println("Вы вышли из программы! Удачи!");
                logger.info("Пользователь вышел из программы!");
                break;
            }

            System.out.print("Введите первое число: ");
            int num1 = EnterNum();
            logger.info("Пользователь ввел первое число: " + num1);
            System.out.print("Введите второе число: ");
            int num2 = EnterNum();
            logger.info("Пользователь ввел второе число: " + num2);
            String res;

            if (choice == 1) {
                res = "\nРезультат: " + num1 + " + " + num2 + " = " + Sum(num1, num2);
                System.out.println(res);
                logger.info(res);
            }
            else if (choice == 2){
                res = "\nРезультат: " + num1 + " - " + num2 + " = " + Sub(num1, num2);
                System.out.println(res);
                logger.info(res);
            }
            else if (choice == 3){
                res = "\nРезультат: " + num1 + " * " + num2 + " = " + Mul(num1, num2);
                System.out.println(res);
                logger.info(res);
            }
            else if (choice == 4){
                res = "\nРезультат: " + num1 + " / " + num2 + " = " + Div(num1, num2);
                System.out.println(res);
                logger.info(res);
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
        return (float)n1 / n2;
    }

}
