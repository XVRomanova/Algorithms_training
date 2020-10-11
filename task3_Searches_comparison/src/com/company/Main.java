package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = makeSortedArrayList(1000);

        double start1 = System.nanoTime();
        for (int i = 0; i <= arrayList.size(); ++i) {
            int number = (int) (Math.random() * arrayList.size());
            linearSearch(arrayList, number);
        }
        double finish1 = System.nanoTime();
        double timeConsumedMillis1 = (finish1 - start1)/  Math.pow(10,6);
        System.out.println("Time for linear search: " + timeConsumedMillis1);

        double start2 = System.nanoTime();
        for (int i = 0; i <= arrayList.size(); ++i) {
            int number = (int) (Math.random() * arrayList.size());
            binarySearch(arrayList, (int) number);
        }
        double finish2 = System.nanoTime();
        double timeConsumedMillis2 = (finish2 - start2) /  Math.pow(10,6);
        System.out.println("Time for binary search: " + timeConsumedMillis2);


        double ratio = timeConsumedMillis1/timeConsumedMillis2;
        System.out.println(ratio);
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
            }
            if (guess < number) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return index;


    }

    public static int linearSearch(ArrayList<Integer> list, int number) {
        int index = -1;
        for (int i = 0; i < list.size(); ++i) {
            if (list.get(i) == number) {
                index = i;
            }
        }

        return index;
    }


}
