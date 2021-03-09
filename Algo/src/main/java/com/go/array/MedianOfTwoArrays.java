package com.go.array;

public class MedianOfTwoArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0;
        boolean medianFound = false;
        int nums1Length = nums1.length;
        int nums2Length = nums2.length;

        int mid = (nums1Length+nums2Length)%2;

        System.out.println(mid);
        while(!medianFound) {

        }


        return result;
    }

    public static void main(String[] args) {
        int[] nums1={2,7,9,18};
        int[] nums2={4,6,7,10,13,15,16};
        System.out.println(new MedianOfTwoArrays().findMedianSortedArrays(nums1,nums2));
    }
}
