package HW5;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int nums[] = new int[5];
        int len = nums.length;

        for (int i = 0; i < len; i++) {
            System.out.print("Введите " + (i + 1) + "-ое число: ");
            nums[i] = Input();
        }

        System.out.print("Исходный массив: ");
        PrintArray(nums);

        Sort(nums);

        System.out.print("Отсортированный массив: ");
        PrintArray(nums);
    }

    public static Integer Input(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void Sort(int arr[]) {
        int n = arr.length;

        for (int i = n / 2 - 1; i >= 0; i--)
            Heap(arr, n, i);

        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            Heap(arr, i, 0);
        }
    }

    public static void Heap(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])
            largest = l;

        if (r < n && arr[r] > arr[largest])
            largest = r;

        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            Heap(arr, n, largest);
        }
    }

    static void PrintArray(int arr[]) {
        int length = arr.length;
        for (int i = 0; i < length; i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}
