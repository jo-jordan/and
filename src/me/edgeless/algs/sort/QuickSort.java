package me.edgeless.algs.sort;

import me.edgeless.algs.common.ArrayUtil;
import me.edgeless.algs.common.Constant;

import java.util.Arrays;

/**
 * QuickSort
 * <p>
 * 步骤：
 * 1、从数组中挑选基准值pivot
 * 2、分割：重新排序数列，将所有比基准值小的移动至基准值前面，大的移动至基准值后面，以此形成新的子序列
 * 3、递归排序子序列，直到子序列已是单个元素为止
 *
 * 时间复杂度：WORST:O(n^2); BEST:O(nlogn); AVG:O(nlogn)
 * 空间复杂度：根据基准点的选取，平均O(nlogn)
 *
 * @author : lzjlxebr
 * @date : 2020-11-20 12:11
 **/
public class QuickSort implements Sort {

    @Override
    public void start(int[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private void sort(int[] arr, int left, int right) {

        if (right > left) {
            int pivotIndex = partition(arr, left, right);
            sort(arr, left, pivotIndex - 1);
            sort(arr, pivotIndex + 1, right);
        }
    }

    private int partition(int[] arr, int left, int right) {
        int pivot = arr[left]; // 选取每个分区的第一个作为基准值

        ArrayUtil.swap(arr, right, left); // 首先将基准值放置到right，也就是序列最后
        int storeIndex = left;

        // right - 1 是因为right - 1的位置上已经是pivot了
        for (int i = left; i < right; i++) {
            if (arr[i] < pivot) {
                ArrayUtil.swap(arr, i, storeIndex);
                storeIndex++;
            }
        }
        ArrayUtil.swap(arr, right, storeIndex); // 将基准值移动到新的基准点上
        return storeIndex;
    }
}
