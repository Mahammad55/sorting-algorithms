package sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {8, 10, 2, 6, 3, 9, 4, 5, 7, 1};
        System.out.println("Origin array -> " + Arrays.toString(array));

        selectionSort(array);
        System.out.println("Sorted array -> " + Arrays.toString(array));
    }

    private static void selectionSort(int[] unSortedArray) {
        int length = unSortedArray.length;

        for (int i = 0; i < length; i++) {
            int minIndex = i;

            for (int j = i + 1; j < length; j++) {
                if (unSortedArray[j] < unSortedArray[minIndex]) {
                    minIndex = j;
                }
            }
            swap(unSortedArray, i, minIndex);
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
}
