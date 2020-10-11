package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = makeArrayList(5);
        System.out.println(arrayList);
        System.out.println(linearSearch(arrayList, 5));
        System.out.println(linearSearch(arrayList, 4));

    }

    public static ArrayList<Integer> makeArrayList(int n) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            result.add(i);
        }

        return result;
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
