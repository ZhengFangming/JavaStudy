package com.itheima.arraydemo;

public class ArrayDemo3 {
    public static void main(String[] args) {
        //1.定义数组
        int[] arr = {1,2,3,4,5};
        //2.获取数组里面的所有的元素
        //格式： 数组名[索引]

        //利用循环来改进代码
        //开始条件: 0
        //结束条件: 数组的长度 - 1(最大索引)

        //但是如果数组长度过长,仅仅通过数的方式确定结束条件不合适

        //Java中特性 关于数组的一个长度属性 length
        //调用方式: 数组名.length
        //System.out.println(arr.length);

        //扩展: idea中提供了一种快速的生成数组的遍历方式
        //数组名.fori

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

        }
    }
}
