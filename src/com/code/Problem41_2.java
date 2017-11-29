package com.code;

/**
 * 输入一个正整数s，打印出所有和为s的连续正数序列（至少含有两个数）。
 */
public class Problem41_2 {
    public static void main(String[] args) {
        findContinuousSequence(15);
    }
    public static void findContinuousSequence(int target) {
        if (target < 3) {
            return;
        }
        int small = 1;
        int big = 2;
        int mid = (target+1)/2;
        int sum = small + big;
        while (small < mid) {
            if (sum == target) {
                printContinuousSequence(small,big);
            }
            while (sum > target && small < mid) {
                sum -= small;
                small++;
                if (sum == target) {
                    printContinuousSequence(small,big);
                }
            }
            big++;
            sum += big;
        }
    }
    private static void printContinuousSequence(int small,int big) {
        for (int i = small; i <= big; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
