package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {8, 10, 2, 6, 3, 9, 4, 5, 7, 1};
        System.out.println("Origin array -> " + Arrays.toString(array));

        insertionSort(array);
        System.out.println("Sorted array -> " + Arrays.toString(array));
    }
    //  5 2 1 6 4 --> 2 5 1 6 4 --> 1 2 5 6 4 --> 1 2 5 6 4 --> 1 2 4 5 6

    private static void insertionSort(int[] unSortedArray) {
        int length = unSortedArray.length;

        for (int i = 1; i < length; i++) {
            int temp = unSortedArray[i];
            int j = i - 1;

            while (j >= 0 && unSortedArray[j] > temp) {
                unSortedArray[j+1] = unSortedArray[j];
                j--;
            }
            unSortedArray[j + 1] = temp;
        }
    }
}
