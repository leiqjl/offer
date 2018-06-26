package com.code;

/**
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为 1.
 */
public class Problem8 {

    public static void main(String[] args) {
        Problem8 problem6 = new Problem8();
        int[] array = {3, 4, 5, 1, 2};
        int result = problem6.minNumberInRotateArray(array);
        System.out.println(result);
        int[] array1={1,0,1,1,1};
        int result1 = problem6.minNumberInRotateArray(array1);
        System.out.println(result1);
    }

    public int minNumberInRotateArray(int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        int low = 0;
        int high = array.length - 1;
        int mid = low;
        while (array[low] >= array[high]) {
            if ((high - low) == 1) {
                mid = high;
                break;
            }
            mid = (low + high) / 2;
            if (array[low] == array[mid] && array[mid] == array[high]) {
                return midInOrder(array);
            }
            if (array[mid] >= array[high]) {
                low = mid;
            } else if (array[mid] <= array[high]) {
                high = mid;
            }
        }
        return array[mid];
    }

    private int midInOrder(int[] array) {
        int min = array[0];
        for (int anArray : array) {
            if (min > anArray) {
                min = anArray;
            }
        }
        return min;
    }

}
