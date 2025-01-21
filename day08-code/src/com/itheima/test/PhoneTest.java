package com.itheima.test;

public class PhoneTest {
    public static void main(String[] args) {
        Phone p = new Phone();

        //给手机对象中赋值
        p.brand = "小米";
        p.price = 1999.99;

        //获取手机对象中的值
        System.out.println(p.brand);
        System.out.println(p.price);

        //调用Phone类中的方法
        p.call();
        p.playGame();

        Phone p2 = new Phone();
        p2.brand = "Apple";
        p2.price = 9999.99;
        System.out.println(p2.brand);
        System.out.println(p2.price);
        p2.call();
        p2.playGame();

    }
}
