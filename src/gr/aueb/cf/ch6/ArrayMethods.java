package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Collection of array methods:
 * - Count of an element
 * - Filter evens, print the result
 * - Map to double
 * - Check if there's at least a positive integer
 * - Check if all elements in array are positive numbers
 */
public class ArrayMethods {

    public static void main(String[] args) {
        int[] arr = {4, 2, 4, 4, 5};
        int n = 4;
        System.out.println("arr has " + countOccurrences(arr, n) + " occurrences of " + n);

        filterEvens(arr); // expecting 4 2 4 4

        System.out.println("doubled array: " + Arrays.toString(doubleMap(arr))); // 8 4 8 8 10

        System.out.println("Arr has at least one positive: " + hasOnePositive(arr)); // true

        System.out.println("arr has all positive numbers: " + areAllPositives(arr)); // true
    }

    /**
     * counts times an element is found in an array
     * @param arr int[]
     * @param toFind int
     * @return int count
     */
    public static int countOccurrences(int[] arr, int toFind) {
        int count = 0;
        if (arr == null) throw new IllegalArgumentException("Array cant be null");
        for (int el : arr) {
            if (el == toFind) count++;
        }
        return count;
    }

    /**
     * prints out the even numbers in an array
     * @param arr int[]
     */
    public static void filterEvens(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array cant be null");
        for (int el : arr) {
            if (el % 2 == 0) {
                System.out.print(el + " ");
            }
        }
        System.out.println();
    }

    /**
     * doubles all elements of arr and returns new array
     * @param arr int[]
     * @return int[] mappedArray
     */
    public static int[] doubleMap(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array cant be null");
        int[] mappedArray = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            mappedArray[i] = arr[i] * 2;
        }
        return mappedArray;
    }

    /**
     * finds if arr has at least 1 positive number
     * @param arr int[]
     * @return true/false
     */
    public static boolean hasOnePositive(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array cant be null");
        for (int el : arr) {
            if (el > 0) return true;
        }
        return false;
    }

    /**
     * finds if all numbers in arr are positive
     * @param arr int[]
     * @return true/false
     */
    public static boolean areAllPositives(int[] arr) {
        if (arr == null) throw new IllegalArgumentException("Array cant be null");
        for (int el: arr) {
            if (el < 0) return false;
        }
        return true;
    }
}
