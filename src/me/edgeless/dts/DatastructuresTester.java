package me.edgeless.dts;

import java.io.IOException;
import java.util.Scanner;

/**
 * DatastructuresTester
 * <p>
 * Description write in here.
 *
 * @author : lzjlxebr
 * @date : 2020-11-21 09:26
 **/
public class DatastructuresTester {
    public static void main(String[] args) {
        bloomFilterTest();
    }

    private static void bloomFilterTest() {
        final int len = 2048;
        BloomFilter bloomFilter = BloomFilter.make(len,
                new HashFunctions[] {
                        (value) -> Math.abs(value.hashCode()) % len,
                        (value) -> Math.abs(value.hashCode()) % len
                });


        while (true) {
            Scanner scanner = new Scanner(System.in);
            String value = scanner.nextLine();

            System.out.printf("Before %s added %b\n", value, bloomFilter.query(value));
            bloomFilter.add(value);
            System.out.printf("Query %s is %b\n", value, bloomFilter.query(value));

            if ("exit".equals(value)) {
                break;
            }
        }
    }
}
