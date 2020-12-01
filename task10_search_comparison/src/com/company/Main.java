package com.company;

import java.util.Arrays;
import java.util.function.UnaryOperator;

import static com.company.QuickSort.quickSort;
import static com.company.MergeSort.mergeSort;
import static com.company.BubbleSort.bubbleSort;
import static com.company.InsertionSort.insertionSort;
import static com.company.SelectionSort.selectionSort;

public class Main {

    public static int N = 100;

    public static void main(String[] args) {

        double timeQuickSort = 0;
        double timeMergeSort = 0;
        double timeBubbleSort = 0;
        double timeInsertionSort = 0;
        double timeSelectionSort = 0;

        for (int i = 0; i < 100; i++) {
            int[] arr = makeUnsortedList(N);
            timeQuickSort += measureExecutionTime(arr, QuickSort::quickSort);
            timeMergeSort += measureExecutionTime(arr, MergeSort::mergeSort);
            timeBubbleSort += measureExecutionTime(arr, BubbleSort::bubbleSort);
            timeInsertionSort += measureExecutionTime(arr, InsertionSort::insertionSort);
            timeSelectionSort += measureExecutionTime(arr, SelectionSort::selectionSort);
        }

        System.out.printf("Average time for QuickSort: %1.5f\n ", timeQuickSort / 1000);
        System.out.printf("Average time for MergeSort: %1.5f\n ", timeMergeSort / 1000);
        System.out.printf("Average time for BubbleSort: %1.5f\n ", timeBubbleSort / 1000);
        System.out.printf("Average time for InsertionSort: %1.5f\n ", timeInsertionSort / 1000);
        System.out.printf("Average time for SelectionSort: %1.5f\n ", timeSelectionSort / 1000);

    }

    public static int[] makeUnsortedList(int N) {
        int[] array = new int[N];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()) * 100);
        }

        return array;
    }

    public static double measureExecutionTime(int[] unsortedList, UnaryOperator<int[]> sort) {
        int newLength = unsortedList.length;
        int[] copiedArray = Arrays.copyOf(unsortedList, newLength);

        double start = System.nanoTime();
        sort.apply(copiedArray);
        double finish = System.nanoTime();

        return (finish - start) / Math.pow(10, 6);
    }

}
