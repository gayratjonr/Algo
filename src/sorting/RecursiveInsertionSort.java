package sorting;

import java.util.Arrays;

public class RecursiveInsertionSort {
    public static void main(String[] args) {
        RecursiveInsertionSort insertionSort = new RecursiveInsertionSort();
        int arr[] = {12, 11, 13, 5, 6};
        insertionSort.sort(arr, arr.length - 1);
        System.out.println(Arrays.toString(arr));

    }

    private void sort(int[] array, int n) {
        if (n == 1)
            return;
        sort(array, n - 1);
        for (int j = n; j > 0; j--) {
            if (array[j - 1] > array[j]) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
            }
        }
    }
}
