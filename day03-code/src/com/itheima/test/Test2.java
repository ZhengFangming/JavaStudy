package com.itheima.test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        /*需求:
        您和您相亲对象约在餐厅见面,
        键盘录入两个0~10的整数,表示你和相亲对象的衣服时髦度
        如果你的衣服时髦度大于相亲对象的衣服时髦度,则相亲成功,输出true
        否则输出false
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的衣服时髦度:");
        int myFashion = sc.nextInt();
        System.out.println("请输入您相亲对象的衣服时髦度:");
        int girlFashion = sc.nextInt();

        boolean result = myFashion > girlFashion;
        System.out.println(result);

    }
}
