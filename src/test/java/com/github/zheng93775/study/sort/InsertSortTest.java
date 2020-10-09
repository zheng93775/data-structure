package com.github.zheng93775.study.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class InsertSortTest {

    @Test
    public void randomTest() {
        Random random = new Random();
        int length = random.nextInt(1000);
        Integer[] sourceArray = new Integer[length];
        for (int i = 0; i < length; i++) {
            sourceArray[i] = random.nextInt();
        }
        println("sourceArray", sourceArray);
        Integer[] standardArray = Arrays.copyOf(sourceArray, sourceArray.length);
        Arrays.sort(standardArray);
        println("standard", standardArray);
        InsertSort insertSort = new InsertSort();
        insertSort.sort(sourceArray);
        println("insertSort", sourceArray);
        Assert.assertArrayEquals(sourceArray, standardArray);
    }

    private void println(String name, Integer[] array) {
        System.out.print(name + ":");
        for (Integer i : array) {
            System.out.print(" ");
            System.out.print(i);
        }
        System.out.println();
    }
}
