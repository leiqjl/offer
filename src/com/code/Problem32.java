package com.code;

/**
 * 输入一个整数n，求从1到n这n个整数的十进制表示中1出现的次数。
 */
public class Problem32 {
    public static void main(String[] args) {
        System.out.println(numberOf1Between1AndN(43412));
        System.out.println(numberOf1Between1AndN2(43412));
        System.out.println(numberOf1Between1AndN3(43412));
    }
    public static int numberOf1Between1AndN(int n) {
        int number = 0;
        for (int i = 1; i <= n; i++) {
            number += numberOf1(i);
        }
        return number;
    }
    private static int numberOf1(int n) {
        int number = 0;
        while (n > 0) {
            if (n % 10 == 1) {
                number++;
            }
            n /= 10;
        }
        return number;
    }
    //暴力解法
    public static int numberOf1Between1AndN2(int n) {
        int number = 0;
        StringBuffer sb = new StringBuffer();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
        }
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == '1') {
                number++;
            }
        }
        return number;
    }

    //分析各个数位上1进行分析
    //i=100,百位上的数>=2时,n=33234,a=332,b=34,
    // 百位为1,a/10+1=34(0~33),对应100个连续数(0~99),百位为1的点有(a/10+1)*i
    //i=100,百位上的数为1时,n=33134,a=331,b=34,
    // 百位为1,a/10=33(0~32)次包含100个连续数(0~99),a=331时只有35(0~34)个连续数
    // a/10*i + (b+1)
    public static int numberOf1Between1AndN3(int n) {
        int number = 0;
        for (int i = 1; i <= n; i*=10) {
            int a = n/i,b = n%i;
            if (a % 10 == 1) {
                number = number + a/10*i + (b+1);
            } else {
                number = number + (a+8)/10*i;
            }
        }
        return number;
    }
}
