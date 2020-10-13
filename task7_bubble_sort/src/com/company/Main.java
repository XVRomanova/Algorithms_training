package com.company;
import static com.company.Test.allTest;
public class Main {

    public static void main(String[] args) {
        allTest(Main::bubbleSort);
    }

    public static int[] bubbleSort(int[] list) {
        for (int i = 0; i < list.length-1; ++i) {
            for (int j = 0; j < list.length-i-1; ++j) {
                if (list[j+1] < list[j]) {
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }

        }
        return list;
    }
}