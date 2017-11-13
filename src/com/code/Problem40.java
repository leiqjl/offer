package com.code;

import java.util.Arrays;

/**
 * 一个整型数组里除了两个数字之外，其他的数字都出现了两次。
 * 请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n),空间复杂度是O(1)。
 */
public class Problem40 {
    public static void main(String[] args) {
        int[] array = {2,4,3,6,3,2,5,5};
        int[] result = findNumsAppearOnce(array);
        System.out.println(Arrays.toString(result));
    }

    public static int[] findNumsAppearOnce(int[] array) {
        int[] result = new int[2];
        if (array == null || array.length < 2) {
            return null;
        }
        if (array.length == 2) {
            result[0] = array[0];
            result[1] = array[1];
            return result;
        }
        int bitResult = 0;
        for (int i = 0; i < array.length; i++) {
            bitResult ^= array[i];
        }
        int index = findFirstOne(bitResult);
        for (int i = 0; i < array.length; i++) {
            if (isBit(array[i],index)) {
                result[0] ^= array[i];
            } else {
                result[1] ^= array[i];
            }
        }
        return result;
    }

    //找到所有数的异或结果中1首先出现的位置
    private static int findFirstOne(int bitResult) {
        int index = 0;
        while (((bitResult & 1) == 0) && index < 32) {
            bitResult >>= 1;
            index++;
        }
        return index;
    }

    private static boolean isBit(int target,int index) {
        return ((target >> index) & 1) == 1;
    }



}
