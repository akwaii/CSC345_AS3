//Alana Garcia, Brooklyn Wells

//Test Program

import java.util.Arrays;

public class SortComparison {
    public static void main(String[] args) throws Exception {
        // Instance of InsertionSort Class
        InsertionSort sorter = new InsertionSort();

        int[] sizes = { 20000, 40000 }; // List sizes

        // Header for output table
        String header = "    n       Sorted      Random     Reversed";
        String separator = "========  ==========  ==========  ==========";
        System.out.println(header);
        System.out.println(separator);

        // Loop over both array sizes
        for (int size : sizes) {
            // Best case: Sorted array
            int[] sortedArray = new int[size];
            for (int i = 0; i < size; i++) {
                sortedArray[i] = i; // Sorted array
            }
            long sortedTime = sorter.measureExecutionTime(Arrays.copyOf(sortedArray, sortedArray.length));

            // Average case: Random array
            int[] randomArray = sorter.randomArray(size);
            long randomTime = sorter.measureExecutionTime(Arrays.copyOf(randomArray, randomArray.length));

            // Worst case: Reversed array
            int[] reversedArray = sorter.reversedArray(size);
            long reversedTime = sorter.measureExecutionTime(Arrays.copyOf(reversedArray, reversedArray.length));

            // Output formatting
            String output = size + "      " +
                            (sortedTime / 1e9) + "       " +  // Convert to seconds
                            (randomTime / 1e9) + "       " +  // Convert to seconds
                            (reversedTime / 1e9);             // Convert to seconds

            // Print the output
            System.out.println(output);
        }
    }
}