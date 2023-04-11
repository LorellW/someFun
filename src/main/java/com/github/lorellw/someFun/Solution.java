package com.github.lorellw.someFun;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Queue;

public class Solution {

    /*
        Given an n x n array, return the array elements arranged from outermost elements to the middle element, traveling clockwise.
        int[][] array
                = {{1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}};
        int[] r = {1, 2, 3, 4, 5, 10, 15, 20, 25, 24, 23, 22, 21, 16, 11, 6, 7, 8, 9, 14, 19, 18, 17, 12, 13};
     */

    public static int[] snail(int[][] array) {
        array = new int[0][0];
        int n = array.length;
        int n2 = array[0].length;
        Queue<Integer> queue = new ArrayDeque<>();
        for (int j = 0; j < n / 2 + 1; j++) {
            for (int i = j; i < n - j; i++) {
                queue.add(array[j][i]);
            }
            for (int i = j + 1; i < n - j; i++) {
                queue.add(array[i][n - j - 1]);
            }
            for (int i = n - j - 2; i >= j; i--) {
                queue.add(array[n - j - 1][i]);
            }
            for (int i = n - j - 2; i >= j + 1; i--) {
                queue.add(array[i][j]);
            }
        }
        int[] result = new int[n * n];
        for (int i = 0; i < result.length; i++) {
            result[i] = queue.remove();
        }
        return result;
    }
}
