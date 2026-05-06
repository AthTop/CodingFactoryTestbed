package gr.aueb.cf.ch6;

/**
 * Uses getMaxPosition method to find the highest number
 * between 2 array indexes and return its index
 */
public class MaxPosition {

    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 5, 7, 8};

        System.out.println("Max between index 2 and 5 is found at: " + getMaxPosition(arr, 2, 5)); // 5
    }

    /**
     * finds the index of the highest int between indexes
     * @param arr int[]
     * @param low starting index inclusive
     * @param high ending index inclusive
     * @return index of max between low and high
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        if (arr == null) throw new IllegalArgumentException("Array is null");
        if (low < 0 || high >= arr.length) throw new IllegalArgumentException("Indexes out of array bounds");

        int max = arr[low];
        int index = low;
        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > max) {
                max = arr[i];
                index = i;
            }
        }

        return index;
    }
}
