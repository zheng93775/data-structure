package com.github.zheng93775.study.sort;

import com.github.zheng93775.study.sort.base.Sort;

public abstract class QuickSort implements Sort {

    @Override
    public <T extends Comparable<T>> void sort(T[] sourceArray) {
        partSort(sourceArray, 0, sourceArray.length - 1);
    }

    abstract <T extends Comparable<T>> void partSort(T[] sourceArray, int startIndex, int endIndex);

    protected <T extends Comparable<T>> int splitByMiddle(T[] sourceArray, int startIndex, int endIndex, T middle) {
        int i = startIndex;
        int j = endIndex;
        while (i <= j) {
            while (i <= endIndex && sourceArray[i].compareTo(middle) <= 0) {
                i++;
            }
            while (j >= startIndex && sourceArray[j].compareTo(middle) > 0) {
                j--;
            }
            if (i < j) {
                swap(sourceArray, i, j);
            }
        }
        return j;
    }

    protected <T extends Comparable<T>> void swap(T[] sourceArray, int index1, int index2) {
        T tmp = sourceArray[index1];
        sourceArray[index1] = sourceArray[index2];
        sourceArray[index2] = tmp;
    }
}
