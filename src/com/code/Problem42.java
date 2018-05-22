package com.code;

/**
 * 输入一个英文句子，翻转句子中的单词顺序，但单词内的字符的顺序不变。
 * 为简单起见，标点符号和普通字母一样处理。
 * 例如输入字符串"I am a student."，则输出"student. a am I"。
 */
public class Problem42 {

    public static void main(String[] args) {
        Problem42 p = new Problem42();
        String target = "I am a student.";
//        target = " a ";
        String result = p.reverseString(target);
        String result2 = p.reverseString2(target);
        System.out.println(result);
        System.out.println(result2);
    }

    //方法1 无法处理字符串两端为空字符的情况，" a "。
    public String reverseString(String str) {
        if (str == null || str.trim().equals("")) {
            return str;
        }
        String[] strs = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = strs.length-1; i >= 0; i--) {
            sb.append(strs[i]);
            if(i > 0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }

    public String reverseString2(String str) {
        if (str == null || str.trim().equals("")) {
            return str;
        }
        char[] chars = str.toCharArray();
        reverse(chars, 0, chars.length-1);
        int begin = 0,end = 0;
        while (begin != chars.length-1) {
            if (chars[begin] == ' ') {
                begin++;
                end++;
            } else if (chars[end] == ' ' || end == chars.length-1) {
                reverse(chars, begin, --end);
                begin = ++end;
            } else {
                end++;
            }
        }

        return String.valueOf(chars);
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
