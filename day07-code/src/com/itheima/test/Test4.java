package com.itheima.test;

public class Test4 {
    public static void main(String[] args) {
        //需求：把一个数组中的元素复制到另一个新数组中去。
        //定义一个老数组并赋值相应的元素
        int[] arr = {1,2,3,4,5,6,7};
        //定义一个新数组和老数组长度相同
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(newArr[i]+" ");
        }

    }
}
