//Alana Garcia, Brooklyn Wells

//Insertion Sort Implementation

/*
 * Reference:
 * Title: "Insertion Sort Algorithm in Java - Full Tutorial With Source"
 * Author: Coding With John
 * URL: https://www.youtube.com/watch?v=0lOnnd50cGI
 * Date of Publication: November 22, 2021
 */
import java.util.Random;

public class InsertionSort {

    // Method that performs the insertion sort
    public static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int currentValue = inputArray[i];

            int j = i - 1;
            while (j >= 0 && inputArray[j] > currentValue) {
                inputArray[j + 1] = inputArray[j];
                j--;
            }
            inputArray[j + 1] = currentValue;
        }
    }

    // Method that generates a random array
    public static int[] randomArray(int size) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = random.nextInt(size); // Fills array with random numbers
        }
        return arr;
    }

    // Method that generates a reversed array
    public static int[] reversedArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = size - i; // Fills array in decreasing order
        }
        return arr;
    }

    // Method to measure execution time of the insertion sort
    public static long measureExecutionTime(int[] arr) {
        long startTime = System.nanoTime();
        insertionSort(arr);
        long endTime = System.nanoTime();
        return endTime - startTime; // Return execution time in nanoseconds
    }
}