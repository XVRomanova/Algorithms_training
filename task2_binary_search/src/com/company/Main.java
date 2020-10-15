package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = makeSortedArrayList(25);
        System.out.println(arrayList);
        System.out.println(binarySearch(arrayList, 14));
        System.out.println(binarySearch(arrayList, 27));
    }

    public static ArrayList<Integer> makeSortedArrayList(int N) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arrayList.add(i);
        }
        return arrayList;
    }

    public static int binarySearch(ArrayList<Integer> arrayList, int number) {
        int index = -1;
        int low = 0;
        int high = arrayList.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = arrayList.get(mid);
            if (guess == number) {
                index = mid;
                break;
            }
            if (guess < number) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;

    }
}
