package com.company;

import java.util.Arrays;

import static com.company.Test.allTest;

public class QuickSort {

    public static void main(String[] args) {
        allTest(QuickSort::quickSort);
    }

    public static int[] quickSort(int[] array) {
        return innerQuickSort(array, 0, array.length - 1);
    }

    private static int[] innerQuickSort(int[] array, int start, int end) {
        if (start < end) {
            int pivot = partition(array, start, end);
            innerQuickSort(array, start, pivot - 1);
            innerQuickSort(array, pivot, end);
        }
        return array;
    }

    private static int partition(int[] array, int start, int end) {
        int leftIndex = start;
        int rightIndex = end;
        int pivot = array[start + (end - start) / 2];

        while (leftIndex <= rightIndex) {
            while (array[leftIndex] < pivot) {
                leftIndex++;
            }

            while (array[rightIndex] > pivot) {
                rightIndex--;
            }

            if (leftIndex <= rightIndex) {
                int tmp = array[leftIndex];
                array[leftIndex] = array[rightIndex];
                array[rightIndex] = tmp;
                leftIndex++;
                rightIndex--;
            }
        }

        return leftIndex;
    }
}
