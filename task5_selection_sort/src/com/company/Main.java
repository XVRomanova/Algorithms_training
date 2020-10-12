package com.company;
import static com.company.Test.allTest;

public class Main {

    public static void main(String[] args) {

        allTest(Main::selectionSort);

    }


    public static int[] selectionSort(int[] list) {
        for (int i = 0; i < list.length-1; ++i) {
            for (int j = i + 1; j < list.length; ++j) {
                if (list[i] > list[j]) {
                    int item = list[i];
                    list[i] = list[j];
                    list[j] = item;
                }
            }
        }
        return list;
    }



}
