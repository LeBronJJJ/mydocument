package com.trainning.array;

/**
 * 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * 思路
 * 首先要做的选取一个点 一个基准点 我们可以选择右上角的点 它的特点是什么，就是在第一行最大，最后一列最小。
 * <p>
 * 那它左边的数肯定越来越小，下面的数越来越大，这就是一个有力的判断依据了，比它大就往下走，比她小就往左走
 * <p>
 * 注意边界条件 注意空值情况
 * <p>
 * 这道题就能写出来了
 * <p>
 * 还有注意行列之间的关系 脑子一定要清晰：
 **/
public class findIn2DArray {

    public boolean Find(int target, int[][] array) {
        //array.length表示行的长度
        //array[0].length表示列的长度
        int rowLen = array.length;
        int colLen = array[0].length;
        if (array.length == 0 || rowLen == 0) {
            return false;
        }
        int i = rowLen - 1;
        int j = 0;
        while (i >= 0 && i <= rowLen && j >= 0 && j <= colLen - 1) {
            //注意这里i  j  的真实意义
            if (array[j][i] > target) {
                i--;
            } else if (array[j][i] < target) {
                j++;
            } else {
                return true;
            }
        }
        return false;
    }
}
