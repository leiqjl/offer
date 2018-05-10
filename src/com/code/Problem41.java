package com.code;

import java.util.Arrays;

/**
 * 输入一个递增序列的数组和一个数字s，在数组中查找两个数,使得他们的和正好是s。
 * 输出任意一对即可。
 */
public class Problem41 {
    public static void main(String[] args) {
        int[] array = {1,2,4,7,11,15};
        int target = 15;
        int[] result = findNumbersWithSum(array,target);
        System.out.println(Arrays.toString(result));
    }
    public static int[] findNumbersWithSum(int[] array,int sum) {
        int[] result = new int[2];
        if (array == null || array.length<1) {
            return result;
        }
        int left = 0;
        int right = array.length-1;
        while (right > left) {
            int curSum = array[left] + array[right];
            if (curSum == sum) {
                result[0] = array[left];
                result[1] = array[right];
                return result;
            } else if (curSum > sum) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }
}
