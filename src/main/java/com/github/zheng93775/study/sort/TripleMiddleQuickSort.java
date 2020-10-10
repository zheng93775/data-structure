package com.github.zheng93775.study.sort;

public class TripleMiddleQuickSort extends QuickSort {

    @Override
    protected <T extends Comparable<T>> void partSort(T[] sourceArray, int startIndex, int endIndex) {
        if (endIndex - startIndex <= 0) {
            return;
        }
        int middleIndex = (startIndex + endIndex) / 2;
        swapDisorder(sourceArray, startIndex, endIndex);
        swapDisorder(sourceArray, startIndex, middleIndex);
        swapDisorder(sourceArray, middleIndex, endIndex);
        if (endIndex - startIndex <= 2) {
            return;
        }
        T middle = sourceArray[middleIndex];
        swap(sourceArray, startIndex + 1, middleIndex);
        middleIndex = splitByMiddle(sourceArray, startIndex + 2, endIndex - 1, middle);
        swap(sourceArray, startIndex + 1, middleIndex);
        partSort(sourceArray, startIndex, middleIndex - 1);
        partSort(sourceArray, middleIndex + 1, endIndex);
    }

    protected <T extends Comparable<T>> void swapDisorder(T[] sourceArray, int index1, int index2) {
        if (sourceArray[index1].compareTo(sourceArray[index2]) < 0) {
            return;
        }
        swap(sourceArray, index1, index2);
    }
}
