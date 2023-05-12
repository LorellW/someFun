package com.github.lorellw.someFun;

public class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length + nums2.length];
        int j = 0, k = 0;
        for (int i = 0; i < arr.length; i++) {
            if (k >= nums2.length ||( j < nums1.length && nums1[j] < nums2[k])) {
                arr[i] = nums1[j];
                j++;
            } else {
                arr[i] = nums2[k];
                k++;
            }
        }
        return findMedian(arr);
    }

    private static double findMedian(int[] arr) {
        if (arr.length % 2 == 0) {
            return (arr[arr.length / 2 - 1] + arr[arr.length / 2]) / 2.0;
        } else {
            return arr[arr.length / 2];
        }
    }

}
