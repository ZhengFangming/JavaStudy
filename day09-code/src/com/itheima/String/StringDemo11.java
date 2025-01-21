package com.itheima.String;

import java.util.Scanner;

public class StringDemo11 {
    public static void main(String[] args) {
        //需求: 根据身份证号查验个人信息
        //定义一个字符串记录身份证号码
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的身份证号码");
        String id = sc.next();

        //获取出生年月日
        String year = id.substring(6,10);
        String month = id.substring(10,12);
        String day = id.substring(12,14);

        System.out.println("人物信息为:");
        System.out.println("出生年月日为:" + year + "年" + month + "月" + day + "日");


        //获取性别
        char gender = id.charAt(16);
        int num = gender - 48;
        //利用ASCII将字符转化为整数
        if(num % 2 == 0){
            System.out.println("性别为: 女");
        }else{
            System.out.println("性别为: 男");
        }

    }
}
