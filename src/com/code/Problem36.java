package com.code;


import java.util.Arrays;

/**
 * 在数组中的两个数字如果前面一个数字大于后面的数字，则两个数字组成一个逆序对。
 * 输入一个数组，求出这个数组中的逆序对的总数。
 */
public class Problem36 {

    public static void main(String[] args) {
        int[] array = {7,5,6,4};
        int[] array1 = {1,2,3,4,5,6,7,0};
        System.out.println(inversePairs(array));
        System.out.println(inversePairs(array1));
    }

    //利用归并排序
    public static int inversePairs(int [] array) {
        if (array == null || array.length <= 0) {
            return 0;
        }
        int[] copy = Arrays.copyOf(array,array.length);
        return inversePairs(array, copy, 0, array.length-1);
    }

    private static int inversePairs(int[] array,int[] copy,int low,int high) {
        if (low == high) {
            return 0;
        }
        int mid = (high+low)/2;
        int left = inversePairs(copy,array,low,mid);
        int right = inversePairs(copy,array,mid+1,high);
        int count = 0;
        int i = mid;
        int j = high;
        int index = high;
        while (i >= low && j >= mid+1) {
            if (array[i] > array[j]) {
                copy[index--] = array[i--];
                count += j-mid;
            } else {
                copy[index--] = array[j--];
            }
        }
        while (i >= low) {
            copy[index--] = array[i--];
        }
        while (j >= mid+1) {
            copy[index--] = array[j--];
        }
        return left+right+count;

    }

}
