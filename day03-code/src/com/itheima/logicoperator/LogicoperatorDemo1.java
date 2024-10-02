package com.itheima.logicoperator;

public class LogicoperatorDemo1 {
    public static void main(String[] args) {
        //1. & 并且
        //两边都为真, 结果才为真
        System.out.println(true & true);
        System.out.println(false & true);
        System.out.println(true & false);
        System.out.println(false & false);

        //2. | 或者
        //两边一个为真即为真
        System.out.println(true | true);
        System.out.println(false | true);
        System.out.println(true | false);
        System.out.println(false | false);

    }
}
