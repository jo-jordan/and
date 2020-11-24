package me.edgeless.algs.sort;

import me.edgeless.algs.common.ArrayUtil;

/**
 * SelectionSort
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2020-11-21 12:22
 **/
public class SelectionSort implements Sort {
    @Override
    public void start(int[] arr) {
        int len = arr.length;
        if (len == 1) return;

        for (int i = 0; i < len - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < len; j++) {
                if (arr[minIndex] > arr[j]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                ArrayUtil.swap(arr, i, minIndex);
            }
        }
    }
}
