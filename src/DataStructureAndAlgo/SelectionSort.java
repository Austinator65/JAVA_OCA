package DataStructureAndAlgo;

public class SelectionSort {
    public static void main(String[] args) {

        int array[] = { 3, 5, 4, 2, 6, 8, 7, 87, 534, 76, 99, 4, 79 };

        selectionSort(array);
        for (int i : array) {
            System.out.println(i);
        }
    }

    private static void selectionSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            int minimumValue = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[minimumValue] > array[j]) {
                    minimumValue = j;
                }
            }
            int temp = array[i];
            array[i] = array[minimumValue];
            array[minimumValue] = temp;
        }

    }

}
