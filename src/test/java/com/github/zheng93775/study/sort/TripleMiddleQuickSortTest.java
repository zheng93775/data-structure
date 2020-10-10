package com.github.zheng93775.study.sort;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

public class TripleMiddleQuickSortTest {

    @Test
    public void randomTest() {
        Random random = new Random();
        int length = random.nextInt(100);
        Integer[] sourceArray = new Integer[length];
        for (int i = 0; i < length; i++) {
            sourceArray[i] = random.nextInt(100);
        }
        println("sourceArray", sourceArray);
        Integer[] standardArray = Arrays.copyOf(sourceArray, sourceArray.length);
        Arrays.sort(standardArray);
        println("standard", standardArray);
        TripleMiddleQuickSort quickSort = new TripleMiddleQuickSort();
        quickSort.sort(sourceArray);
        println("quickSort", sourceArray);
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
