//Alana Garcia, Brooklyn Wells

//Test Program
import java.util.Arrays;

public class SortComparison {
    public static void main(String[] args) throws Exception {

        int[] sizes = { 20000, 40000 }; // List sizes

        // Header for output table
        String header = "    n       Sorted       Random      Reversed";
        String separator = "========  ==========    ========    ==========";
        System.out.println(header);
        System.out.println(separator);

        // Loop over both array sizes
        for (int size : sizes) {
            // Best case: Sorted array
            int[] sortedArray = new int[size];
            for (int i = 0; i < size; i++) {
                sortedArray[i] = i; // Sorted array
            }
            
            long sortedTime = InsertionSort.measureExecutionTime(Arrays.copyOf(sortedArray, sortedArray.length));

            // Average case: Random array
            int[] randomArray = InsertionSort.randomArray(size);
            long randomTime = InsertionSort.measureExecutionTime(Arrays.copyOf(randomArray, randomArray.length));

            // Worst case: Reversed array
            int[] reversedArray = InsertionSort.reversedArray(size);
            long reversedTime = InsertionSort.measureExecutionTime(Arrays.copyOf(reversedArray, reversedArray.length));

            //Formatting and Printing the output
            System.out.printf(size + ": ");
            System.out.printf( "%10.6f",sortedTime / 1e9 );
            System.out.print("Sec ");
            System.out.printf("%10.6f", randomTime / 1e9 );
            System.out.print("Sec ");
            System.out.printf("%10.6f", reversedTime / 1e9 );
            System.out.print("Sec  \n");

        }
    }
}