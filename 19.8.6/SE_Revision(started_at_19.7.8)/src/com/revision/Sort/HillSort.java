package com.revision.Sort;
//希尔排序，也称 递减增量排序算法，是插入排序的一种更高效的改进版本。希尔排序是 非稳定排序算法
/**
 * 将待排序数组按照步长gap进行分组，然后将每组的元素利用直接插入排序的方法进行排序；
 * 每次再将gap折半减小，循环上述操作；
 * 当gap=1时，利用直接插入，完成排序
 */
public class HillSort {
    public static void sort(int[] a) {
        int length = a.length;
        int h = 1;
        while (h < length / 3) h = 3 * h + 1;
        for (; h >= 1; h /= 3) {
            for (int i = 0; i < a.length - h; i += h) {
                for (int j = i + h; j > 0; j -= h) {
                    if (a[j] < a[j - h]) {
                        int temp = a[j];
                        a[j] = a[j - h];
                        a[j - h] = temp;
                    }
                }
            }
        }
    }
}
