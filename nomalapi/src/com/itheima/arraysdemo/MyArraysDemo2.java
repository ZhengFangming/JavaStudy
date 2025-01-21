package com.itheima.arraysdemo;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraysDemo2 {
    public static void main(String[] args) {
        Integer[] arr = {2, 3, 1, 6, 4, 5, 7, 10, 9, 8};
        //第二个参数是一个接口, 所以我们在调用方法的时候, 需要传递这个接口的实现类对象
        //作为排序的规则. 但是这个实现类, 我们只要使用一次, 所以就没有必要单独的去写一个类, 直接
        //采取匿名内部类的方式就可以了

        //底层原理:
        //利用插入排序+二分查找的方式进行排序的
        Arrays.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println("o1: " + o1);
                System.out.println("o2: " + o2);
                return o2 - o1;
            }
        });
        //简单理解:
        //o1-o2: 升序排列
        //o2-o1: 降序排列

        System.out.println(Arrays.toString(arr));
    }
}
