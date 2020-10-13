package com.company;

public class Main {

    public static void main(String[] args) {
        com.company.Test.allTest(Main::insertionSort);
    }

    public static int[] insertionSort(int[] list) {
        for (int i = 1; i < list.length; ++i) {
            int j = i;
            while (j > 0 && list[j-1] > list[j]) {
                int temp = list[j];
                list[j] = list[j-1];
                list[j-1] = temp;
                j--;
            }
        }

        return list;
    }
}
