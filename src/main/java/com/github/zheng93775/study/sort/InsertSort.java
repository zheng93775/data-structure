package com.github.zheng93775.study.sort;

import com.github.zheng93775.study.sort.base.Sort;

/**
 * 插入排序
 */
public class InsertSort implements Sort {

    public <T extends Comparable<T>> void sort(T[] sourceArray) {
        for (int i = 1; i < sourceArray.length; i++) {
            T tmp = sourceArray[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (tmp.compareTo(sourceArray[j]) < 0) {
                    sourceArray[j + 1] = sourceArray[j];
                } else {
                    break;
                }
            }
            sourceArray[j + 1] = tmp;
        }
    }
}
