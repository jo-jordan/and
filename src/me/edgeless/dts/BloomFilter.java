package me.edgeless.dts;

/**
 * BloomFilter
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2020-11-21 09:20
 **/
public class BloomFilter {
    private boolean[] array;
    private HashFunctions[] functions;

    private BloomFilter() {}

    private BloomFilter(int length, HashFunctions[] functions) {
        this.array = new boolean[length];
        this.functions = functions;
    }

    public static BloomFilter make(int length, HashFunctions[] functions) {
        return new BloomFilter(length, functions);
    }

    public void add(String value) {
        int[] r = computeHashes(value);
        for (int index : r) {
            array[index] = true;
        }
    }

    public boolean query(String value) {
        int[] r = computeHashes(value);

        for (int index : r) {
            if (!array[index]) {
                return false;
            }
        }
        return true;
    }

    private int[] computeHashes(String value) {
        int[] r = new int[functions.length];
        for (int i = 0; i < functions.length; i++) {
            r[i] = functions[i].hash(value);
        }
        return r;
    }
}

interface HashFunctions {
    int hash(String value);
}