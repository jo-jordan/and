package me.edgeless.algs.sort;

import me.edgeless.algs.common.Constant;

import java.util.Arrays;

/**
 * SortTester
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2020-11-20 22:53
 **/
public class SortTester {
    public static void main(String[] args) {
        bubbleSort();
        quickSort();
        insertionSort();
        shellSort();

        selectionSort();
    }

    public static void bubbleSort() {
        int[] arr = Arrays.copyOf(Constant.ARR, Constant.ARR.length);
        long t1 = System.currentTimeMillis();
        Sort sort = new BubbleSort();
        sort.start(arr);
        long t2 = System.currentTimeMillis();
        System.out.printf("BubbleSort: %dms\n", (t2 - t1));
    }

    public static void quickSort() {
        int[] arr = Arrays.copyOf(Constant.ARR, Constant.ARR.length);
        long t1 = System.currentTimeMillis();
        Sort sort = new QuickSort();
        sort.start(arr);
        long t2 = System.currentTimeMillis();
        System.out.printf("QuickSort: %dms\n", (t2 - t1));
    }

    public static void insertionSort() {
        int[] arr = Arrays.copyOf(Constant.ARR, Constant.ARR.length);
        long t1 = System.currentTimeMillis();
        Sort sort = new InsertionSort();
        sort.start(arr);
        long t2 = System.currentTimeMillis();
        System.out.printf("InsertionSort: %dms\n", (t2 - t1));
    }

    public static void shellSort() {
        int[] arr = Arrays.copyOf(Constant.ARR, Constant.ARR.length);
        long t1 = System.currentTimeMillis();
        Sort sort = new ShellSort();
        sort.start(arr);
        long t2 = System.currentTimeMillis();
        System.out.printf("ShellSort: %dms\n", (t2 - t1));
    }

    public static void selectionSort() {
        int[] arr = Arrays.copyOf(Constant.ARR, Constant.ARR.length);
        long t1 = System.currentTimeMillis();
        Sort sort = new SelectionSort();
        sort.start(arr);
        long t2 = System.currentTimeMillis();
        System.out.printf("SelectionSort: %dms\n r: %s", (t2 - t1), Arrays.toString(arr));
    }
}
