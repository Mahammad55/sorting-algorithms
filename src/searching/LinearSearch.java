package searching;

public class LinearSearch {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int index = linearSearch(array, 7);

        if (index != -1) {
            System.out.printf("The index of element is %s", index);
        } else {
            System.out.println("Element doesn't found");
        }
    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
