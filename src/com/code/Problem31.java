package com.code;

/**
 * 输入一个整型数组，数组里有正数也有负数。
 * 数组中一个或连续多个整数组成一个子数组。
 * 求所有子数组和的最大值。要求时间复杂度为O(n)。
 */
public class Problem31 {
    public static void main(String[] args) {
        int[] array = {1,-2,3,10,-4,7,2,-5};
        System.out.println(findMaxSumOfSubArray(array));
        System.out.println(findMaxSumOfSubArray2(array));
    }
    public static int findMaxSumOfSubArray(int[] array) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                if (sum <= 0) {
                    sum = array[i];
                } else {
                    sum += array[i];
                }
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    //动态规划
    public static int findMaxSumOfSubArray2(int[] array) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        if (array != null && array.length > 0) {
            for (int i = 0; i < array.length; i++) {
                sum = (sum <= 0) ? array[i] : sum+array[i];
                max = (max > sum) ? max : sum;
            }
        }
        return max;
    }

}
