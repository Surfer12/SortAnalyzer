import java.util.Comparator;

/**
 * The InsertionSort class implements the insertion sort algorithm.
 */
public class InsertionSort implements SortingAlgorithm, Comparator<Integer> {

    /**
     * Finds the position where a key should be inserted in a sorted portion of the
     * array.
     *
     * @param array The array being sorted.
     * @param start The start index of the sorted portion.
     * @param key   The key to be inserted.
     * @return The index where the key should be inserted.
     */
    private int findInsertionPoint(int[] array, int start, int key) {
        int i = start - 1;
        while (i >= 0 && compare(key, array[i]) < 0) { // < 0 means a is less than b
            array[i + 1] = array[i];
            i--;
        }
        return i + 1;
    }

    @Override
    public void sort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = findInsertionPoint(array, i, key);
            array[j] = key;
        }
    }

    @Override
    public int compare(Integer a, Integer b) {
        return a.compareTo(b);
    }
}
