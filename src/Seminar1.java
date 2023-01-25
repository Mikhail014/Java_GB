import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;

public class Seminar1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        String name = iScanner.next(); // nextLine - несколько слов, next - одно
        Print(name);
        iScanner.close(); // 0:52:41
    }

    public static void Print(String name) {
        LocalTime ldt = LocalTime.now();
        if (ldt.isAfter(LocalTime.of(5, 0)) && ldt.isBefore(LocalTime.of(16, 59)))
        {
            System.out.println("Доброе утро, " + name);
        }

    }

}
