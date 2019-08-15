package com.revision.Sort;

public class QuickSort {
    public static void sort(int[] a,int i,int j) {
        if (i >= j) {
            return;
        }
        int left = i;
        int right = j;
        int pivot =findPivot(a , i ,j);
        sort(a,i,pivot-1);
        sort(a,pivot+1,j);
    }
    private static int findPivot(int[] a, int left, int  right) {
        int digHole = a[right];
        int begin = left;
        int end = right;
        while(begin < end){
            while(begin < end && a[begin] <= digHole)
                begin++;
            a[begin] = a[end];
            while(begin < end && a[end] >= digHole)
                end--;
            a[end] = a[begin];
        }
        a[begin] = digHole;
        return begin;
    }
}
