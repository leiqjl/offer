package com.code;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Problem9_2 {

    //f(n)=f(n-1)+f(n-2)
    public int JumpFloor(int n) {
        if (n == 1 || n == 2) {
            return n;
        }
        int sum = 0;
        int sumBackStep1 = 2;
        int sumBackStep2 = 1;
        for (int i = 3; i<=n; i++) {
            sum = sumBackStep1 + sumBackStep2;
            sumBackStep2 = sumBackStep1;
            sumBackStep1 = sum;
        }
        return sum;
    }


}
