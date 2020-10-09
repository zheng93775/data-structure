package com.github.zheng93775.study.sort.base;

public interface Sort {
    <T extends Comparable<T>> void sort(T[] sourceArray);
}
