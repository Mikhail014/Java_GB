package HW3;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        int[] sortArr = new int[10];
        AddRandomNums(sortArr);
        System.out.print("Исходный массив: ");
        PrintArr(sortArr);
        int[] res = mergeSort(sortArr);
        System.out.println();
        System.out.print("Результат: ");
        PrintArr(res);
    }

    public static void PrintArr(int[] arr){
        for (Integer item: arr){
            System.out.print(item + " ");
        }
    }

    public static void AddRandomNums(int[] arr){
        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            arr[i] = r.nextInt(10);
        }
    }

    public static int[] mergeSort(int[] sortArr) {
        int[] buf1 = Arrays.copyOf(sortArr, sortArr.length);
        int[] buf2 = new int[sortArr.length];
        int[] res = mergeSortInner(buf1, buf2, 0, sortArr.length);
        return res;
    }

    public static int[] mergeSortInner(int[] b1, int[] b2, int startInd, int endInd) {
        if (startInd >= endInd - 1) {
            return b1;
        }

        int mid = startInd + (endInd - startInd) / 2;
        int[] sorted1 = mergeSortInner(b1, b2, startInd, mid);
        int[] sorted2 = mergeSortInner(b1, b2, mid, endInd);

        int ind1 = startInd;
        int ind2 = mid;
        int destInd = startInd;
        int[] res = sorted1 == b1 ? b2 : b1;
        while (ind1 < mid && ind2 < endInd) {
            res[destInd++] = sorted1[ind1] < sorted2[ind2] ? sorted1[ind1++] : sorted2[ind2++];
        }
        while (ind1 < mid) {
            res[destInd++] = sorted1[ind1++];
        }
        while (ind2 < endInd) {
            res[destInd++] = sorted2[ind2++];
        }
        return res;
    }

}
