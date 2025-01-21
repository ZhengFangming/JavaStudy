package com.itheima.oopTest4;

public class PhoneTest {
    public static void main(String[] args) {
        //定义数组存储3部手机对象
        Phone[] arr = new Phone[3];

        Phone p1 = new Phone("Apple",19999,"Black");
        Phone p2 = new Phone("Xiaomi",1999,"White");
        Phone p3 = new Phone("HUAWEI",14999,"Purple");

        arr[0] = p1;
        arr[1] = p2;
        arr[2] = p3;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getPrice();
        }
        int avg = sum / arr.length;
        System.out.println("三部手机的价格平均值为" + avg);
    }
}
