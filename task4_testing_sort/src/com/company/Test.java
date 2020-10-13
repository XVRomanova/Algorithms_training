package com.company;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Test {
   

    public static void main(String[] args) {
    }

    public static boolean test(int[] sortedList, int[] output) {
        return Arrays.equals(sortedList, output);
    }

    static void allTest(UnaryOperator<int[]> sort) {
        int[] input1 = new int[]{-1, 2, -5, 6, 7, 8};
        int[] input2 = new int[]{1, 1, 1};
        int[] input3 = new int[]{-5, -2, -1, -4, -6, -3};
        int[] input4 = new int[0];
        int[] input5 = new int[]{4, 2, 3, 5};
        int[] input6 = new int[]{2, 1, 3, 1, 3};
        int[] output1 = new int[]{-5, -1, 2, 6, 7, 8};
        int[] output2 = new int[]{1, 1, 1};
        int[] output3 = new int[]{-6, -5, -4, -3, -2, -1};
        int[] output4 = new int[0];
        int[] output5 = new int[]{2, 3, 4, 5};
        int[] output6 = new int[]{1, 1, 2, 3, 3};
        System.out.print("Test 1: ");
        System.out.println(test((int[])sort.apply(input1), output1));
        System.out.print("Test 2: ");
        System.out.println(test((int[])sort.apply(input2), output2));
        System.out.print("Test 3: ");
        System.out.println(test((int[])sort.apply(input3), output3));
        System.out.print("Test 4: ");
        System.out.println(test((int[])sort.apply(input4), output4));
        System.out.print("Test 5: ");
        System.out.println(test((int[])sort.apply(input5), output5));
        System.out.print("Test 6: ");
        System.out.println(test((int[])sort.apply(input6), output6));
    }
}
