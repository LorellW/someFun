package com.github.lorellw.someFun;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    private static List<String> strings;

    public static List<String> singlePermutations(String str) {
        strings = new ArrayList<>();
        permutations(str.split(""),str.length());
        return strings;
    }

    private static void permutations(String[] arr, int size) {
        if (size == 1) {
            if (!strings.contains(arrToString(arr))) {
                strings.add(arrToString(arr));
            }
        }
        for (int i = 0; i < size; i++) {
            permutations(arr, size - 1);
            if (size % 2 == 0) {
                swap(arr, 0, size - 1);
            } else {
                swap(arr, i, size - 1);
            }
        }
    }

    private static void swap(String[] arr, int i, int j) {
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static String arrToString(String[] arr) {
        StringBuilder builder = new StringBuilder();
        for (String s : arr) {
            builder.append(s);
        }
        return builder.toString();
    }
}
