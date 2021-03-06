package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort sort = new SelectionSort();
        Integer arr[] = {64, 25, 12, 22, 11};
        sort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private void simpleSort(int[] array) {
         int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
        { 
            // Find the minimum element in unsorted array 
            int min_idx = i; 
            for (int j = i+1; j < n; j++) 
                if (arr[j] < arr[min_idx]) 
                    min_idx = j; 
  
            // Swap the found minimum element with the first 
            // element 
            int temp = arr[min_idx]; 
            arr[min_idx] = arr[i]; 
            arr[i] = temp; 
        } 
    }

    private <T extends Comparable> void sort(T[] array){
        for (int i = 0; i < array.length - 1; i++) {
            int index = i;
            for (int j = i + 1; j < array.length ; j++) {
                if (array[index].compareTo(array[j]) > 0){
                    T temp = array[j];
                    array[j] = array[index];
                    array[index] = temp;
                }
            }
        }
    }
}
