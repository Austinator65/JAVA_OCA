package DataStructureAndAlgo;

public class BinarySearch {
    public static void main(String[] args) {

        int array[] = new int[1000000];
        int target = 778766;

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        int manIndex = binarySearch(array, target);
        /*
         * int index = Arrays.binarySearch(array, target);
         * 
         * if (index == -1) {
         * System.out.println(target + "Not found");
         * } else {
         * System.out.println("Element found at: " + index);
         * 
         * }
         */

        if (manIndex == -1) {
            System.out.println(target + "not found");
        } else
            System.out.println("Element found at: " + manIndex);
    }
    // public static int binarySearch()

    private static int binarySearch(int[] array, int target) {

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {

            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("middle: " + value);

            if (value < target)
                low = middle + 1;
            else if (value > target)
                high = middle - 1;
            else
                return middle; // target found

        }

        return -1; // target not found
    }
}
