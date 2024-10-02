package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo1 {
    public static void main(String[] args) {
        //+
        System.out.println(3+2);
        //-
        System.out.println(9-6);
        //*
        System.out.println(8*9);

        //如果在计算的时候有小数参与
        //结论:
        //在代码中, 如果有小数参与计算,结果有可能不精确的
        //为什么呢?
        //具体原因到JavaSE进阶时再详细讲解
        System.out.println(1.1 + 1.1);
        System.out.println(1.1 + 1.01);
        System.out.println(1.1 - 1.01);
        System.out.println(1.1 * 1.01);


    }
}
