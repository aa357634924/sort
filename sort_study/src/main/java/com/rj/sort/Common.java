package com.rj.sort;

import java.util.Comparator;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @Author: rj
 * @Date: 2020-04-04 11:42
 * @Version: 1.0
 */
public class Common{

    public static int[] initArray(int n){
        int[] arr = new int[n];
        System.out.print("******** 初始化数组为：");
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        return arr;
    }

    public static void printSortArr(int[] arr){
        System.out.print("******** 排序后数组为：");
        for (int temp:arr) {
            System.out.print(temp+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = initArray(10);
        printSortArr(arr);
    }

    /**
     * @Author: rj
     * @Date: 2020-04-04
     * @Description: 比较两个元素
     * @Param:
     * @Return:
     * @Version 1.0
     */
    public static int compare(int o1, int o2) {
        return o1-o2;
    }

    /**
     * @Author: rj
     * @Date: 2020-04-04
     * @Description:  交换元素
     * @Param: i，j 分别代表待交换的两个元素的index
     * @Return:
     * @Version 1.0
     */
    public static void exchange(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


}
