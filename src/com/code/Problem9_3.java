package com.code;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。
 * 求该青蛙跳上一个n级的台阶总共有多少种跳法。
 */
public class Problem9_3 {

    //2^(n-1) 第n级台阶必跳 前面n-1级台阶每级都有跳/不跳2种情况。
    public int JumpFloor2(int n) {
        return 1 << (n - 1);
    }


}
