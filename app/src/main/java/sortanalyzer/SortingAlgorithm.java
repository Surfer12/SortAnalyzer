package sortanalyzer;

/**
 * The SortingAlgorithm interface defines the contract for sorting algorithms.
 */
public interface SortingAlgorithm {
    
    /**
     * Sorts the given array in ascending order.
     *
     * @param array The array to be sorted.
     */
    void sort(int[] array);
    
    /**
     * Compares two integers.
     *
     * @param a The first integer to compare.
     * @param b The second integer to compare.
     * @return true if a is less than b, false otherwise.
     */
    default boolean compare(int a, int b) {
        return a < b;
    }
    
    /**
     * Swaps two elements in the array.
     *
     * @param array The array containing the elements to be swapped.
     * @param i The index of the first element.
     * @param j The index of the second element.
     */
    default void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
