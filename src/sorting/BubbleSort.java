package sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {10, 5, 6, 4, 2, 9, 7, 3, 6};
        System.out.println("Origin array -> "+ Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Sorted array -> "+ Arrays.toString(array));
    }

    private static void bubbleSort(int[] unSortedArray) {
        int length = unSortedArray.length;

        for (int i = 0; i < length - 1; i++) {
            for (int j = 0; j < length - 1 - i; j++) {
                if (unSortedArray[j] > unSortedArray[j + 1]) {
                    int temp = unSortedArray[j];
                    unSortedArray[j] = unSortedArray[j + 1];
                    unSortedArray[j + 1] = temp;
                }
            }
        }
    }
}
