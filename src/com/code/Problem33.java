package com.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 输入一个正整数数组，把数组里所有数字拼接起来排成一个数，打印能拼接出的所有数字中最小的一个。
 */
public class Problem33 {
    public static void main(String[] args) {
        int[] array = {3,32,321};
        System.out.println(printMinNumber(array));
    }
    public static String printMinNumber(int [] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                String s1 = o1 + "" + o2;
                String s2 = o2 + "" + o1;
                return s1.compareTo(s2);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (int j : list) {
            stringBuilder.append(j);
        }
        return stringBuilder.toString();
    }
}
