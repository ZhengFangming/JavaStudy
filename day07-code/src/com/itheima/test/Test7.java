package com.itheima.test;

public class Test7 {
    public static void main(String[] args) {
        /*
        需求：把整数上的每一位都添加到数组中
         */

        //1.计算数组的长度
        int number = 12345;
        //定义一个变量临时记录number的值，为了后面再使用原数值
        int temp = number;
        //定义一个变量进行统计
        int count = 0;
        while(number != 0){
            number = number / 10;
            count++;
        }
        //2.定义一个数组
        int[] arr = new int[count];//动态初始化
        //把整数上的每一位都添加到数组中
        int index = arr.length - 1;
        while(temp != 0){
            int ge = temp % 10;
            temp = temp / 10;
            arr[index] = ge;
            index--;
        }
        //验证结果
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
