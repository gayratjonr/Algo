package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int arr[] = {12, 11, 13, 5, 6};
        insertionSort.simpleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void simpleSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    private <T extends Comparable> void sort(T[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j - 1].compareTo(array[j]) > 0) {
                    T temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }
}
