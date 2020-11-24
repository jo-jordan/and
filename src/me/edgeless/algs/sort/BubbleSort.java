package me.edgeless.algs.sort;

import me.edgeless.algs.common.ArrayUtil;
import me.edgeless.algs.common.Constant;

import java.util.Arrays;

/**
 * BubbleSort
 * <p>
 * 冒泡排序
 * 一次比较两个元素，将数值更小的交换到数列最前端，直到排序完成
 *
 * 时间复杂度：WORST:O(n^2); BEST:O(n); AVG:O(n^2)
 * 空间复杂度：O(n)
 *
 * @author : lzjlxebr
 * @date : 2020-11-20 11:41
 **/
public class BubbleSort implements Sort {

    @Override
    public void start(int[] arr) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < len - i - 1; j++) {

                int cur = arr[j];
                int next = arr[j + 1];

                if (cur - next > 0) {
                    // 说明next更小，next需要和cur做交换
                    ArrayUtil.swap(arr, j, j+1);
                    isSwapped = true;
                }
            }

            if (!isSwapped) {
                // 当出现第一次就没有任何交换的情形，则表示该数列本身已经是有序的，此时可以达到O(n)的最优时间复杂度
                break;
            }
        }
    }
}
