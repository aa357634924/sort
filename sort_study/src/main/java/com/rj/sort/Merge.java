package com.rj.sort;

/**
 * @Author: rj
 * @Date: 2020-04-04 17:58
 * @Version: 1.0
 * 归并排序
 * 原理：
 * 1.拆分成细小的模块
 * 2.小模块内部进行排序
 * 3.将小模块进行合并
 * 时间复杂度 O(nlogn)
 * 缺点：要创建临时表，以空间换时间
 */
public class Merge {

    public static void main(String[] args) {
        int[] array = Common.initArray(50);
        // 临时数组，用于存放比较完的数据
        int[] temp = new int[array.length];
        merge(array, temp, 0, array.length - 1);
        Common.printSortArr(array);
    }

    // 拆分模块
    public static void merge(int[] arr, int[] temp, int start, int end) {
        if (start < end) {
            // 拆分模块
            int mid = (start + end) / 2;
            // 拆分左模块
            merge(arr, temp, start, mid);
            // 拆分右模块
            merge(arr, temp, mid + 1, end);
            // 排序合并模块
            sortMerge(arr, temp, start, mid, end);
        }
    }

    // 排序合并模块
    public static void sortMerge(int[] arr, int[] temp, int start, int mid, int end) {
        // 临时数组的当前指针下标
        int t = start;
        // 左模块的当前指针下标
        int left = start;
        // 右模块的当前指针下标
        int right = mid + 1;
        // 比较两个模块中 各自最小值 的大小，最小的放到临时模块中，同时指针下标后移一位
        while (left <= mid && right <= end) {
            if (arr[left] <= arr[right]) {
                temp[t++] = arr[left++];
            } else {
                temp[t++] = arr[right++];
            }
        }
        // 当左右模块中，某一方填充完毕，另一方还有剩余，此时须把剩余的数据追加到临时数组中
        while (left <= mid) {
            temp[t++] = arr[left++];
        }
        while (right <= end) {
            temp[t++] = arr[right++];
        }

        // 将临时数组中的数据，按照索引区间写回原数组中
        for (int i = start; i <= end; i++) {
            arr[i] = temp[i];
        }

    }
}
