package com.proj2.algorithms;

import java.util.Arrays;

public class MMQuickSort {

    public static int findKthSmallest(int[] arr, int k) {
        return kthSmallestHelper(arr, 0, arr.length - 1, k);
    }

    private static int kthSmallestHelper(int[] arr, int left, int right, int k) {
        if (k > 0 && k <= right - left + 1) {
            int n = right - left + 1;
            int i;

            int[] median = new int[(n + 4) / 5];
            for (i = 0; i < n / 5; i++) {
                median[i] = findMedian(arr, left + i * 5, 5);
            }

            if (i * 5 < n) {
                median[i] = findMedian(arr, left + i * 5, n % 5);
                i++;
            }

            int medOfMed = (i == 1) ? median[i - 1] : kthSmallestHelper(median, 0, i - 1, i / 2);

            int pos = partition(arr, left, right, medOfMed);

            if (pos - left == k - 1)
                return arr[pos];
            if (pos - left > k - 1)
                return kthSmallestHelper(arr, left, pos - 1, k);

            return kthSmallestHelper(arr, pos + 1, right, k - pos + left - 1);
        }

        return Integer.MAX_VALUE;
    }

    private static int partition(int[] arr, int left, int right, int x) {
        int i;
        for (i = left; i < right; i++)
            if (arr[i] == x)
                break;
        swap(arr, i, right);

        i = left;
        for (int j = left; j <= right - 1; j++) {
            if (arr[j] <= x) {
                swap(arr, i, j);
                i++;
            }
        }
        swap(arr, i, right);
        return i;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static int findMedian(int[] arr, int i, int n) {
        if (n > 0) {
            Arrays.sort(arr, i, i + n); 
        }
        return arr[i + n / 2];
    }

}
