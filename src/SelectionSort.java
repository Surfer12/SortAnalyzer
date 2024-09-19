/**
 * The SelectionSort class implements the selection sort algorithm.
 */
public class SelectionSort implements SortingAlgorithm {

    /**
     * Finds the index of the minimum element in a portion of the array.
     *
     * @param array The array being sorted.
     * @param start The start index of the portion to search.
     * @return The index of the minimum element.
     */
    private int findMinimum(int[] array, int start) {
        int minIndex = start;
        for (int i = start + 1; i < array.length; i++) {
            if (compare(array[i], array[minIndex])) {
                minIndex = i;
            }
        }
        return minIndex;
    }

    @Override
    public void sort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = findMinimum(array, i);
            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }
    }
}
