package com.code;

/**
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 */
public class Problem10 {

    public int numberOf1(int target) {
        int count = 0;
        while (target != 0) {
            target &= (target - 1);
            count++;
        }
        return count;
    }
}
