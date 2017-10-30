package com.code;

/**
 * 把只包含因子2、3和5的数称作丑数（Ugly Number）。
 * 求按从小到大的顺序的第1500个丑数。
 */
public class Problem34 {
    public static void main(String[] args) {
        System.out.println(getUglyNumber(1500));
        System.out.println(getUglyNumber1(1500));
    }

    //丑数为前一个丑数乘2、3或5得到的（1除外）
    // 空间换时间
    public static int getUglyNumber(int index) {
        if(index <= 0) {
            return 0;
        } else if (index > 0 && index <7) {
            return index;
        }
        int[] result = new int[index];
        result[0] = 1;
        int u2 = 0, u3 = 0, u5 = 0;
        for (int i = 1; i < index; i++) {
            result[i] = Math.min(result[u2]*2,Math.min(result[u3]*3,result[u5]*5));
            if (result[i] == result[u2] * 2) {
                u2++;
            }
            if (result[i] == result[u3] * 3) {
                u3++;
            }
            if (result[i] == result[u5] * 5) {
                u5++;
            }
        }
        return result[index-1];
    }
    public static int getUglyNumber1(int index) {
        if(index <= 0) {
            return 0;
        }
        int n = 0;
        int uglyNumber = 0;
        while (uglyNumber < index) {
            n++;
            if (isUgly(n)) {
                uglyNumber++;
            }
        }
        return n;
    }
    private static boolean isUgly(int number) {
        while (number % 2 == 0) {
            number /= 2;
        }
        while (number % 3 == 0) {
            number /= 3;
        }
        while (number % 5 == 0) {
            number /= 5;
        }
        return number == 1;
    }


}
