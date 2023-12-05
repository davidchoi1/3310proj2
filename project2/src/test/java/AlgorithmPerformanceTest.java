import java.util.Arrays;
import java.util.Random;

import com.proj2.algorithms.MMQuickSort;
import com.proj2.algorithms.MergeSort;
import com.proj2.algorithms.QuickSort;

public class AlgorithmPerformanceTest {

    private static final int MIN_SIZE = 1024; // Start size of array
    private static final int MAX_SIZE = 4194304; // Maximum size of array
    private static final int TRIALS = 10; // Number of trials per data set
    private static final Random rand = new Random();

    private static int[] generateRandomArray(int size) {

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt();
        }
        return arr;
    }

    private static long calculateAverageRuntime(long[] runtimes) {
        Arrays.sort(runtimes);
        long total = 0;
        for (int i = 1; i < runtimes.length - 1; i++) { // Exclude the first and last (best and worst)
            total += runtimes[i];
        }
        return total / (runtimes.length - 2);
    }

    private static long[] mmQuickSort(int k, int[] data, long[] runtimes) {
        for (int trial = 0; trial < TRIALS; trial++) {
            int[] copy = Arrays.copyOf(data, data.length); // Copy data for each trial
            long startTime = System.nanoTime();

            MMQuickSort.findKthSmallest(copy, k);

            long endTime = System.nanoTime();
            runtimes[trial] = endTime - startTime;
        }

        return runtimes;

    }

    private static long[] quickSort(int k, int[] data, long[] runtimes) {
        for (int trial = 0; trial < TRIALS; trial++) {
            int[] copy = Arrays.copyOf(data, data.length); // Copy data for each trial
            long startTime = System.nanoTime();

            QuickSort.findKthSmallest(copy, k);

            long endTime = System.nanoTime();
            runtimes[trial] = endTime - startTime;
        }

        return runtimes;

    }

    private static long[] mergeSort(int k, int[] data, long[] runtimes) {
        for (int trial = 0; trial < TRIALS; trial++) {
            int[] copy = Arrays.copyOf(data, data.length); // Copy data for each trial
            long startTime = System.nanoTime();

            MergeSort.findKthSmallest(copy, k);

            long endTime = System.nanoTime();
            runtimes[trial] = endTime - startTime;
        }

        return runtimes;

    }

    public static void main(String[] args) {
        for (int size = MIN_SIZE; size <= MAX_SIZE; size *= 2) {
            int k = rand.nextInt(0, size - 1);
            int[] data = generateRandomArray(size);
            long[] runtimes = new long[TRIALS];

            long averageQuickSortRuntime = calculateAverageRuntime(quickSort(k, data, runtimes));
            System.out.println("Average QuickSort runtime for size " + size + ": " + averageQuickSortRuntime + " ns");

            long averageMergeSortRuntime = calculateAverageRuntime(mergeSort(k, data, runtimes));
            System.out.println("Average MergeSort runtime for size " + size + ": " + averageMergeSortRuntime + " ns");

            long averageMMQuickSortRunTime = calculateAverageRuntime(mmQuickSort(k, data, runtimes));
            System.out.println("Average MMQuickSort runtime for size " + size + ": " + averageMMQuickSortRunTime + " ns");

            System.out.println();
        }
    }
}
