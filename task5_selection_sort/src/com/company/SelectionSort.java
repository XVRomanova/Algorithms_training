package com.company;
import static com.company.Test.allTest;

public class SelectionSort {

    public static void main(String[] args) {
        allTest(SelectionSort::selectionSort);
    }

    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length-1; ++i) {
            for (int j = i + 1; j < list.length; ++j) {
                if (list[i] > list[j]) {
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }

        return list;
    }
}
