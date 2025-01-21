package com.itheima.String;

import java.util.Scanner;

public class StringDemo9 {
    public static void main(String[] args) {
        /*以字符串的形式从键盘接受一个手机号，将中间四位号码屏蔽
        最终效果为：131****9468*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电话号码");
        String phoneNumber = sc.next();
//        String result = "";
//        for (int i = 0; i < phoneNumber.length(); i++) {
//            char c = phoneNumber.charAt(i);
//            if(i >= 3 && i <= 6){
//                c = '*';
//            }
//            result = result + c;
//        }
//        System.out.println(result);

        //课程上交的方法
        //截取手机号码的前三位和后四位
        String start = phoneNumber.substring(0,3);
        String end = phoneNumber.substring(7);
        String result = start + "****" + end;
        System.out.println(result);
    }
}
