package com.itheima.test;

public class Test2 {
    public static void main(String[] args) {
        /*
        判断101~200之间有多少个素数，并输出所有素数。
         */
        int count = 0;
        System.out.println("101~200之间的素数输出如下：");
        for (int i = 101; i <= 200; i++) {
            boolean flag = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println("一共有"+count+"个素数");
    }
}
