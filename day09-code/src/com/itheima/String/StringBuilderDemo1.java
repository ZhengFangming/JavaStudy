package com.itheima.String;

import java.util.Scanner;

public class StringBuilderDemo1 {
    public static void main(String[] args) {
        //需求: 键盘接受一个字符串，程序判断出该字符串是否是对称字符串，并在控制台打印是或不是

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();

        String result = new StringBuilder().append(str).reverse().toString();

        if(result.equals(str)){
            System.out.println("当前字符串是对称字符串");
        }else{
            System.out.println("当前字符串不是对称字符串");
        }

    }
}
