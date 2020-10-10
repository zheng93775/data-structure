package com.github.zheng93775.study.sort;

public class FirstQuickSort extends QuickSort {

    @Override
    protected <T extends Comparable<T>> void partSort(T[] sourceArray, int startIndex, int endIndex) {
        if (endIndex - startIndex <= 0) {
            return;
        }
        T middle = sourceArray[startIndex];
        int middleIndex = splitByMiddle(sourceArray, startIndex + 1, endIndex, middle);
        swap(sourceArray, startIndex, middleIndex);
        partSort(sourceArray, startIndex, middleIndex - 1);
        partSort(sourceArray, middleIndex + 1, endIndex);
    }
}
