package com.code;

/**
 * 一个二维数组，每一行从左到右递增，每一列从上到下递增．输
 * 入一个二维数组和一个整数，判断数组中是否含有整数。
 */
public class Problem3 {
    public boolean find(int[][] array, int target) {
        if (array == null || array.length == 0) {
            return false;
        }
        int row = 0;
        int column = array[0].length - 1;
        while (row < array.length && column > 0) {
            if (array[row][column] == target) {
                return true;
            } else if (array[row][column] > target) {
                column--;
            } else {
                row++;
            }
        }
        return false;
    }
}
