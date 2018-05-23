package com.code;

/**
 * 字符串左旋操作是把字符串前面的若干个字符转移到字符串的尾部。
 * 请定义一个函数实现字符串的左旋操作的功能。
 * 比如输入字符串"abcdefg"和数字2，该函数将返回左旋转2位得到的结果"cdefgab"。
 */
public class Problem42_2 {

    public static void main(String[] args) {
        Problem42_2 p = new Problem42_2();
        String target = "abcdefg";
        int n = 2;
        String result = p.leftRotateString(target, n);
        String result2 = p.leftRotateString2(target, n);
        System.out.println(result);
        System.out.println(result2);
    }

    public String leftRotateString(String str,int n) {
        if (str == null || str.trim().equals("") || n < 0 || n >str.length()) {
            return str;
        }
        char[] chars = str.toCharArray();
        reverse(chars, 0, n-1);
        reverse(chars, n, chars.length-1);
        reverse(chars, 0, chars.length-1);
        return String.valueOf(chars);
    }

    public String leftRotateString2(String str,int n) {
        if (str == null || str.trim().equals("") || n < 0 || n >str.length()) {
            return str;
        }
        int len = str.length();
        n = n % len;
        str += str;
        return str.substring(n, n+len);
    }

    private void reverse(char[] c,int begin,int end){
        while (begin < end) {
            char tmp = c[begin];
            c[begin] = c[end];
            c[end] = tmp;
            begin ++;
            end --;
        }
    }
}
