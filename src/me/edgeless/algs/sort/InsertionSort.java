package me.edgeless.algs.sort;

import me.edgeless.algs.common.ArrayUtil;
import me.edgeless.algs.common.Constant;

import java.util.Arrays;

/**
 * InsertionSort
 * <p>
 * 1、第一个元素被认为是排序完成的数列
 * 2、之后的每一个元素与前面的数列的每个元素进行比较，直到形成一个新的有序数列
 *
 * 时间复杂度：WORST:O(n^2); BEST:O(n); AVG:O(n^2)
 * 空间复杂度：O(n) + O(1)
 *
 * @author : lzjlxebr
 * @date : 2020-11-20 22:40
 **/
public class InsertionSort implements Sort {

    @Override
    public void start(int[] arr) {
        if (arr.length == 1) return;
        int len = arr.length;
        for (int i = 1; i < len; i++) {
            int curValue = arr[i];
            for (int j = 0; j < i; j++) {
                if (curValue < arr[j]) {
                    ArrayUtil.swap(arr, i, j);
                }
            }
        }
    }
}
