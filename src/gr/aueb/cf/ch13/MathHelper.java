package gr.aueb.cf.ch13;

/**
 * Utility class containing methods to
 * help with math in integer arrays.
 */
public class MathHelper {

    private MathHelper() {}

    /**
     * finds the highest value in an array.
     * @param array int array.
     * @return highest int in the array.
     */
    public static int findMax(int[] array) {
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array can't be null");
        int max = Integer.MIN_VALUE;
        for (int num : array) {
            if (num > max) max = num;
        }
        return max;
    }

    /**
     * finds the lowest value in an array.
     * @param array int array.
     * @return lowest int in the array.
     */
    public static int findMin(int[] array) {
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array can't be null");
        int min = Integer.MAX_VALUE;
        for (int num : array) {
            if (num < min) min = num;
        }
        return min;
    }

    /**
     * returns the average of all array values.
     * @param array int array.
     * @return average value of array.
     */
    public static double findAverage(int[] array) {
        if (array == null || array.length == 0) throw new IllegalArgumentException("Array can't be null");
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return (double) sum / array.length;
    }
}
