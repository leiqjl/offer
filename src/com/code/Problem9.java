package com.code;

/**
 * 输入一个整数n，请你输出斐波那契数列的第n项。
 */
public class Problem9 {

    //递归
    public int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    //非递归
    public int fibonacci1(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        int fn1 = 0;
        int fn2 = 1;
        int result = 0;
        for (int i = 2; i <= n; i++) {
            result = fn1 + fn2;
            fn1 = fn2;
            fn2 = result;
        }
        return result;
    }


}
