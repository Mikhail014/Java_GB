package HW1;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(2);
        for (int i = 1; i < 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0){
                    break;
                }
                else {
                    if (j == i - 1) {
                        System.out.println(i);
                    }
                }
            }
        }
    }
    
}
