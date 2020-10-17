package com.company;

import static com.company.Test.allTest;

public class Main {

    public static void main(String[] args) {
        allTest(Main::mergeSort);
    }

    public static int[] mergeSort(int[] list) {

        if (list.length < 2) {
            return list;
        }

        int middleIndex = list.length / 2;
        int[] leftList = new int[middleIndex];
        int[] rightList = new int[list.length - middleIndex];
        System.arraycopy(list, 0, leftList, 0, leftList.length);
        System.arraycopy(list, middleIndex, rightList, 0, rightList.length);
        mergeSort(leftList);
        mergeSort(rightList);
        merge(list, leftList, rightList);
        return list;
    }


    private static void merge(int[] list, int[] leftList, int[] rightList) {
        int minIndexLeftList = 0;
        int minIndexRightList = 0;

        for (int k = 0; k < list.length; k++) {
            if (minIndexLeftList < leftList.length && minIndexRightList < rightList.length) {
                if (leftList[minIndexLeftList] <= rightList[minIndexRightList]) {
                    list[k] = leftList[minIndexLeftList];
                    minIndexLeftList++;
                } else {
                    list[k] = rightList[minIndexRightList];
                    minIndexRightList++;
                }
            } else if (minIndexLeftList < leftList.length) {
                list[k] = leftList[minIndexLeftList];
                minIndexLeftList++;
            } else if (minIndexRightList < rightList.length) {
                list[k] = rightList[minIndexRightList];
                minIndexRightList++;
            }
        }
    }

}
