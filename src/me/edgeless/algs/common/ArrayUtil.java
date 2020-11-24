package me.edgeless.algs.common;

/**
 * ArrayUtil
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2020-11-20 22:43
 **/
public class ArrayUtil {
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
