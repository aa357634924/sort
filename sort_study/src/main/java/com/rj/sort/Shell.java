package com.rj.sort;

/**
 * @Author: rj
 * @Date: 2020-04-04 11:42
 * @Version: 1.0
 * 希尔排序
 * 通过 步长n 进行分组排序
 * 每组数据进行插入排序
 * 初始 步长n = 数组.length / 2
 * 下一次循环 步长n = 步长n / 2
 */
public class Shell {
    public static void sort(int n){
        int[] array = Common.initArray(n);
        int step = array.length/2;
        while(step > 0){
            for (int j = step; j < array.length; j++) {
                for (int k = j; k >= step; k = k-step) {
                    if (Common.compare(array[k-step],array[k]) > 0) {
                        Common.exchange(array,k-step,k);
                    }
                }
            }
            step = step/2;
        }
        Common.printSortArr(array);
    }

    public static void main(String[] args) {
        sort(10);
    }
}
