package com.code;

/**
 * 实现一个函数，把字符串中的每个空格替换成"%20".
 * 例如输入"We are happy."，则输出"We%20are%20happy."。
 */
public class Problem4 {

    public String replaceString(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        StringBuilder builder = new StringBuilder(str);
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                builder.append("%").append("2").append("0");
            } else {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}
