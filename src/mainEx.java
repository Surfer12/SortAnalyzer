import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class mainEx {
    public static void main(String[] args) {
        SortAnalyzerMain analyzer = new SortAnalyzerMain();
        List<SortingAlgorithm> algorithms = Arrays.asList(new InsertionSort(), new SelectionSort());

        int[] array = generateRandomArray(10000);
        analyzer.compareAlgorithms(algorithms, array);
    }

    private static int[] generateRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(10000);
        }
        return array;
    }
}