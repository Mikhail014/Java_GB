package HW2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Task2 {
    public static void main(String[] args) throws IOException {
        int[] nums = new int[] {45, 36, 27, 98, 56, 67, 78};
        BubbleSort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static int[] BubbleSort(int[] arr) throws IOException {
        Logger logger = Logger.getLogger(Task2.class.getName());
        FileHandler fh = new FileHandler("./src/HW2/log_bs.txt");
        logger.addHandler(fh);
        SimpleFormatter sf = new SimpleFormatter();
        fh.setFormatter(sf);

        boolean isSorted = false;
        int temp;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]){
                    isSorted = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    logger.info(arr[i] + " и " + arr[i + 1] + " поменяли местами!");
                    logger.info(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }

}
