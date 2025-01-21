package com.itheima.String;

import java.util.Scanner;

public class StringDemo4 {
    public static void main(String[] args) {
        //需求: 键盘录入一个字符串, 使用程序实现控制台遍历该字符串
        //两个方法
        //charAt(): 会根据索引获取对应的字符
        //length(): 会返回字符串的长度

        //1.键盘录入一个字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串");
        String str = sc.next();
        System.out.println(str);

        //2. 遍历
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            System.out.println(c);
        }
    }
}
