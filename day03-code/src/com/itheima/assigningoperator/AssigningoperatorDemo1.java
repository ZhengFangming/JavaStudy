package com.itheima.assigningoperator;

public class AssigningoperatorDemo1 {
    public static void main(String[] args) {
        //+=
        //规则: 将左边和右边相加, 然后再把结果赋值给左边
        int a = 10;
        int b = 20;
        //把a+b再把结果赋值给左边的变量a
        a += b;
        //等同于a = (int)(a+b)
        System.out.println(a);
        System.out.println(b);

        //细节
        //+=, -=, *=, /=, %=底层都隐藏了一个强制类型转换
        short s = 1;
        //把左边和右边进行相加, 再把所得的结果2赋值给左边的变量a
        s += 1;
        //等同于: s = (short)(s + 1);
        System.out.println(s);//2

    }
}
