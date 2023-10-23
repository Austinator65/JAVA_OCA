package DataStructureAndAlgo;

public class InsertionSort {
    public static void main(String[] args) {

        int[] array = { 9, 5, 6, 4, 8, 7, 3, 1, 8, 7, 4, 3, 2 };

        selectionSort(array);

        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }

}
