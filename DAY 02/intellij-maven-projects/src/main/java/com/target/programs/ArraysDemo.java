package com.target.programs;

import java.util.Arrays;
public class ArraysDemo {
    public static void main(String[] args){
        int[] nums = {98,87,65};
        System.out.println(Arrays.toString(nums));

        for (int i = 0; i < nums.length; i++) {
            System.out.printf("nums[%d] = %d\n",i,nums[i]);

        }

        int[] nums2;
        nums2 = new int[4];

        for (int i = 0; i < nums2.length; i++) {
            System.out.printf("nums2[%d] = %d\n", i, nums2[i]);

        }

        for (int n: nums2) {
            System.out.println(n);

        }

    }
}
