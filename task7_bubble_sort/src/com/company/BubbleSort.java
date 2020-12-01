package com.company;

import static com.company.Test.allTest;

public class BubbleSort {

    public static void main(String[] args) {
        allTest(BubbleSort::bubbleSort);
    }

    public static int[] bubbleSort(int[] list) {
        for (int i = 0; i < list.length - 1; ++i) {
            for (int j = 0; j < list.length - i - 1; ++j) {
                if (list[j + 1] < list[j]) {
                    int item = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = item;
                }
            }
        }

        return list;
    }
}
