package com.company;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Test {

    public static void main(String[] args) {

    }

    public static boolean test(int[] sortedList, int[] output) {
        return Arrays.equals(sortedList, output);
    }

    static void allTest(UnaryOperator<int []> sort) {
        int[] input1 = {-1, 2, -5, 6, 7, 8};
        int[] input2 = {1, 1, 1};
        int[] input3 = {-5, -2, -1, -4, -6, -3};
        int[] input4 = {};
        int[] input5 = {4, 2, 3, 5};
        int[] input6 = {2, 1, 3, 1, 3};

        int[] output1 = {-5, -1, 2, 6, 7, 8};
        int[] output2 = {1, 1, 1};
        int[] output3 = {-6, -5, -4, -3, -2, -1};
        int[] output4 = {};
        int[] output5 = {2, 3, 4, 5};
        int[] output6 = {1, 1, 2, 3, 3};

        System.out.print("Test 1: ");
        System.out.println(test(sort.apply(input1), output1));
        System.out.print("Test 2: ");
        System.out.println(test(sort.apply(input2), output2));
        System.out.print("Test 3: ");
        System.out.println(test(sort.apply(input3), output3));
        System.out.print("Test 4: ");
        System.out.println(test(sort.apply(input4), output4));
        System.out.print("Test 5: ");
        System.out.println(test(sort.apply(input5), output5));
        System.out.print("Test 6: ");
        System.out.println(test(sort.apply(input6), output6));
    }

}
