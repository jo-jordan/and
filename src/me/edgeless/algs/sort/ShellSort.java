package me.edgeless.algs.sort;

import me.edgeless.algs.common.ArrayUtil;

/**
 * ShellSort
 * <p>
 * 基于插入排序进行了性能优化
 * 步骤：
 * 1、设定一个步长
 * 2、从头开始，每个步长选取一个元素组成新的数列，再对这个数列进行简单插入排序
 * 3、当步长为1时顺序已经排好
 *
 * 实现时可以从头开始，每个步长两头的元素进行比较，后者较小将会与前者替换位置，然后单个角标递增再次使用同样方法进行操作
 * 时间复杂度：WORST:根据步长选取有直接关系，选得好可以到O(nlog^2n); BEST:O(n); AVG:根据步长选取有直接关系
 * 空间复杂度：O(n)
 *
 * @author : lzjlxebr
 * @date : 2020-11-20 23:12
 **/
public class ShellSort implements Sort {

    @Override
    public void start(int[] arr) {
        int len = arr.length;

        if (len == 1) return;
        for (int step = len / 2; step >= 1; step /= 2) {
            for (int i = step; i < len; i++) {
                int j = i - step;
                while (j >= 0 && arr[j] > arr[i]) {
                    ArrayUtil.swap(arr, j + step, j);
                    j -= step;
                }
            }
        }
    }
}
