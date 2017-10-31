package com.code;

import java.util.HashMap;

/**
 * 在字符串中找出第一个只出现一次的字符。
 */
public class Problem35 {

    public static void main(String[] args) {
        String str = "abaccdeff";
        System.out.println(firstNotRepeatingChar(str));
    }

    public static int firstNotRepeatingChar(String str) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if (map.containsKey(str.charAt(i))) {
                map.put(str.charAt(i),map.get(str.charAt(i))+1);
            } else {
                map.put(str.charAt(i),1);
            }
        }
        for (int j = 0; j < str.length(); j++) {
            if (map.get(str.charAt(j)) == 1) {
                return j;
            }
        }
        return -1;
    }
}
