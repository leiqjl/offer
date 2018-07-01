package com.code;

/**
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。
 * 请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 */
public class Problem9_4 {

    //非递归
    public int rectCover(int target) {
        if (target <= 2) {
            return target;
        }
        int sum = 0;
        int t1 = 2;
        int t2 = 1;
        for (int i = 3; i <= target; i++) {
            sum = t1 + t2;
            t2 = t1;
            t1 = sum;
        }
        return sum;
    }


}
