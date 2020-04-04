package com.rj.sort;

/**
 * @Author: rj
 * @Date: 2020-04-04 15:28
 * @Version: 1.0
 * 递归
 *
 */
public class Recursion {
    /**
     * @Author: rj
     * @Date: 2020-04-04
     * @Description: 阶乘，计算 1 * 2 * 3 * ... * n = ?
     * @Param:
     * @Return:
     * @Version 1.0
     */
    public static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int total = factorial(6);
        System.out.println("***** 6 的阶乘 为："+total);
    }
}
