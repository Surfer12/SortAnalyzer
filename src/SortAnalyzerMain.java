import java.util.List; // Update import if necessary

/**
 * The SortAnalyzer class provides utility methods for analyzing and comparing
 * sorting algorithms.
 */
public class SortAnalyzerMain {

    /**
     * Measures the execution time of a given sorting algorithm on an array.
     *
     * @param algorithm The sorting algorithm to measure.
     * @param array     The array to be sorted.
     * @return The execution time in milliseconds.
     */
    public long measureTime(SortingAlgorithm algorithm, int[] array) {
        long startTime = System.nanoTime();
        algorithm.sort(array);
        long endTime = System.nanoTime();
        return (endTime - startTime) / 1_000_000; // Convert nanoseconds to milliseconds
    }

    /**
     * Compares the performance of multiple sorting algorithms on a given array.
     *
     * @param algorithms The list of sorting algorithms to compare.
     * @param array      The array to be sorted.
     */
    public void compareAlgorithms(List<SortingAlgorithm> algorithms, int[] array) {
        for (SortingAlgorithm algorithm : algorithms) {
            int[] arrayCopy = array.clone();
            long time = measureTime(algorithm, arrayCopy);
            System.out.println(algorithm.getClass().getSimpleName() + " took " + time + " ms");
        }
    }
}
