package com.code;

/**
 * 实现函数 double Power （double base，int exponent），求 base 的 exponent次方。
 * 不得使用库函数，同时不需要考虑大数问题。
 */
public class Problem11 {

    public double power(double base, int exponent) {
        double result = 0.0;
        int n;
        if (exponent < 0 && base == 0) {
            throw new RuntimeException("分母不能为0");
        }
        if (exponent == 0) {
            return 1;
        }
        n = Math.abs(exponent);
        while (n != 0) {
            if ((n & 1) == 1) {
                result *= base;
            }
            base *= base;
            n >>= 1;
        }
        return exponent > 0 ? result : 1 / result;
    }

}
