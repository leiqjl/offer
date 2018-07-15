package com.code;

/**
 * 输入一个整数数组，实现一个函数来调整该函数数组中数字的顺序，使得
 * 所有奇数位于数组的前半部分，所有的数组位于数组的后半部分。
 */
public class Problem14 {

    public void reorder(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        int low = 0;
        int high = array.length - 1;
        while (low < high) {
            while (low < high && !isEven(array[low])) {
                low ++;
            }
            while (low < high && isEven(array[low])) {
                high --;
            }
            if (low < high) {
                int temp = array[low];
                array[low] = array[high];
                array[high] = temp;
            }
        }
    }

    private boolean isEven(int n) {
        return (n & 1) == 0;
    }

}
