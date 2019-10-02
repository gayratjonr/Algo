package sorting;

import java.util.Arrays;

public class RecursiveBubbleSort {
    public static void main(String[] args) {
        RecursiveBubbleSort bubbleSort = new RecursiveBubbleSort();
        int arr[] = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort.simpleSort(arr, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    private void simpleSort(int[] array, int n) {
        if (n == 1)
            return;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                int temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
        simpleSort(array, n - 1);
    }

    private <T extends Comparable> void sort(T[] array, int n) {
        if (n == 1)
            return;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].compareTo(array[i + 1]) > 0) {
                T temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
            }
        }
        sort(array, n -1 );
    }

}
