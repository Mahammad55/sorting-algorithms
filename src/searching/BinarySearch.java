package searching;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Arrays.sort(array);

        System.out.println(binarySearch(array, 8));
    }

    private static int binarySearch(int[] sortedArray, int numberToFind) {
        int low = 0;
        int high = sortedArray.length - 1;

        while (low <= high) {
            int middlePosition = (low + high) / 2;
            int middleNumber = sortedArray[middlePosition];

            if (numberToFind == middleNumber) {
                return middlePosition;
            }
            if (numberToFind < middleNumber) {
                high = middlePosition - 1;
            } else {
                low = middlePosition + 1;
            }
        }
        return -1;
    }
}
