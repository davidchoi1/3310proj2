import com.proj2.algorithms.MMQuickSort;
import com.proj2.algorithms.MergeSort;
import com.proj2.algorithms.QuickSort;

public class Tests {

    private static void testQuickSort(int[] array, int k, int expected) {
        int result = QuickSort.findKthSmallest(array, k);
        if (result == expected) {
            System.out.println("QuickSort Test passed for k = " + k);
        } else {
            System.out.println("QuickSort Test failed for k = " + k + ": Expected " + expected + ", but got " + result);
        }
    }

    private static void testMergeSort(int[] array, int k, int expected) {
        int result = MergeSort.findKthSmallest(array, k);
        if (result == expected) {
            System.out.println("MergeSort Test passed for k = " + k);
        } else {
            System.out.println("MergeSort Test failed for k = " + k + ": Expected " + expected + ", but got " + result);
        }
    }

    private static void testMMQuickSort(int[] array, int k, int expected) {
        int result = MMQuickSort.findKthSmallest(array, k);
        if (result == expected) {
            System.out.println("MMQuickSort Test passed for k = " + k);
        } else {
            System.out.println("MMQuickSort Test failed for k = " + k + ": Expected " + expected + ", but got " + result);
        }
    }

    public static void main(String[] args) {
        // test mergeSort 
        testMergeSort(new int[] {-6}, 1, -6);
        testMergeSort(new int[] { 1 }, 1, 1);
        testMergeSort(new int[] { 3, 1, 2 }, 2, 2);
        testMergeSort(new int[] { 1, 3, 3, 2, 2, 1 }, 3, 2);
        testMergeSort(
                new int[] { 34, 13, 80, -40, -53, 30, -34, 85, 15, -64, -61, 83, 20, -55, 20, -20, -68, -79, 34, -60 },
                12, 15);
        testMergeSort(new int[] { 1, 2, 3, 4, 5 }, 4, 4);
        testMergeSort(new int[] { 5, 4, 3, 2, 1 }, 2, 2);
        testMergeSort(new int[] { 2, 2, 2, 2, 2 }, 3, 2);
        testMergeSort(new int[] { -1, -3, -2, -4, -5 }, 3, -3);
        testMergeSort(new int[] { -1, 4, 0, -3, 2, 1 }, 4, 1);

        // test quickSort
        testQuickSort(new int[] {-6}, 1, -6);
        testQuickSort(new int[] { 1 }, 1, 1);
        testQuickSort(new int[] { 3, 1, 2 }, 2, 2);
        testQuickSort(new int[] { 1, 3, 3, 2, 2, 1 }, 3, 2);
        testQuickSort(
                new int[] { 34, 13, 80, -40, -53, 30, -34, 85, 15, -64, -61, 83, 20, -55, 20, -20, -68, -79, 34, -60 },
                12, 15);
        testQuickSort(new int[] { 1, 2, 3, 4, 5 }, 4, 4);
        testQuickSort(new int[] { 5, 4, 3, 2, 1 }, 2, 2);
        testQuickSort(new int[] { 2, 2, 2, 2, 2 }, 3, 2);
        testQuickSort(new int[] { -1, -3, -2, -4, -5 }, 3, -3);
        testQuickSort(new int[] { -1, 4, 0, -3, 2, 1 }, 4, 1);


        // test mmquickSort
        testMMQuickSort(new int[] {-6}, 1, -6);
        testMMQuickSort(new int[] { 1 }, 1, 1);
        testMMQuickSort(new int[] { 3, 1, 2 }, 2, 2);
        testMMQuickSort(new int[] { 1, 3, 3, 2, 2, 1 }, 3, 2);
        testMMQuickSort(
                new int[] { 34, 13, 80, 18, -40, -53, 30, -34, 85, 15, -64, -61, 83, 20, -55, 20, -20, -68, -79, 34, -60 },
                12, 15);
        testMMQuickSort(new int[] { 1, 2, 3, 4, 5 }, 4, 4);
        testMMQuickSort(new int[] { 5, 4, 3, 2, 1 }, 2, 2);
        testMMQuickSort(new int[] { 2, 2, 2, 2, 2 }, 3, 2);
        testMMQuickSort(new int[] { -1, -3, -2, -4, -5 }, 3, -3);
        testMMQuickSort(new int[] { -1, 4, 0, -3, 2, 1 }, 4, 1);
    }
}
