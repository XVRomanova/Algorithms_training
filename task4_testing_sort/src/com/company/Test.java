package com.company;

import java.util.Arrays;
import java.util.function.UnaryOperator;

public class Test {

    public static void main(String[] args) {
    }

    static void allTest(UnaryOperator<int[]> sort) {
        int[][] input = new int[][]{
                {-1, 2, -5, 6, 7, 8},
                {1, 1, 1},
                {-5, -2, -1, -4, -6, -3},
                {0},
                {4, 2, 3, 5},
                {2, 1, 3, 1, 3}
        };

        int[][] output = new int[][]{{-5, -1, 2, 6, 7, 8},
                {1, 1, 1},
                {-6, -5, -4, -3, -2, -1},
                {0},
                {2, 3, 4, 5},
                {1, 1, 2, 3, 3}
        };

        for (int i = 0; i < output.length; i++) {
            System.out.printf("Test: %d %s\n", i + 1, compareResults(sort.apply(input[i]), output[i]));
        }
    }

    private static String compareResults(int[] input, int[] output) {

        if (Arrays.equals(input, output)) {
            return "Ok";
        } else {
            return String.format("Fail; Got: %s; Expected: %s.", Arrays.toString(input), Arrays.toString(output));
        }
    }
}

