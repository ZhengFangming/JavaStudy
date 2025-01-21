package com.itheima.String;

public class StringDemo12 {
    public static void main(String[] args) {
        //StringBuilder可以看成是一个容器, 创建之后里面的内容是可变的
        StringBuilder sb = new StringBuilder();

        //2. 添加元素
//        sb.append(1);
//        sb.append(2.3);
//        sb.append(true);
//        System.out.println(sb);

        //反转
//        sb.reverse();
//
//        //获取长度
//        int len = sb.length();
//        System.out.println(len);

        //链式编程
        sb.append("aaa").append("bbb").append("ccc").append("ddd");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);
    }
}
