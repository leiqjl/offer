package com.code;

/**
 * 统计一个数字在排序数组中出现的次数。
 */
public class Problem38 {
    public static void main(String[] args) {
        int[] array = {1,2,3,3,3,3,4,5};
        System.out.println(getNumberOfK(array,3));
    }
    public static int getNumberOfK(int[] array,int k) {
        int num = 0;
        if (array != null && array.length > 0) {
            int first = getFirstK(array,k,0,array.length-1);
            int last = getLastK(array,k,0,array.length-1);
            if (first > -1 && last > -1) {
                num = last - first + 1;
            }
        }
        return num;
    }

    private static int getFirstK(int[] array,int k,int low,int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low+high)/2;
        if (array[mid] > k) {
            high = mid - 1;
        } else if (array[mid] < k) {
            low = mid + 1;
        } else if (mid-1 >= 0 && array[mid-1] == k) {
            high = mid - 1;
        } else {
            return mid;
        }
        return getFirstK(array,k,low,high);
    }
    private static int getLastK(int[] array,int k,int low,int high) {
        if (low > high) {
            return -1;
        }
        int mid = (low+high)/2;
        if (array[mid] > k) {
            high = mid-1;
        } else if (array[mid] < k) {
            low = mid + 1;
        } else if (mid+1 <= array.length-1 && array[mid+1] == k) {
            low = mid + 1;
        } else {
            return mid;
        }
        return getLastK(array,k,low,high);
    }

}
