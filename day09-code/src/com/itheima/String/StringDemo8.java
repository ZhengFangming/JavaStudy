package com.itheima.String;

import java.util.Scanner;

public class StringDemo8 {
    public static void main(String[] args) {
        /*
        需求：
        把2135变成：零佰零拾零万贰仟壹佰叁拾伍元
        把789变成：零佰零拾零万零仟柒佰捌拾玖元
         */
        //1. 键盘录入一个金额
        int money;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个金额");
            money = sc.nextInt();
            if(money >= 0 && money <= 9999999){
                break;
            }else {
                System.out.println("金额无效");
            }
        }
        //定义一个变量表示金额大写
        String moneyStr = "";
        //得到money中每一个数字再转化成大写
        while (true){
            int ge = money % 10;
            String capitalNumber = getCapitalNumber(ge);
            moneyStr = capitalNumber + moneyStr;
            money = money / 10;
            //如果数字上的每一位全部获取到了，那么money记录的就是0，此时循环结束
            if(money == 0){
                break;
            }
        }
        //3. 在前面补零, 补齐7位
        int count = 7 - moneyStr.length();
        for (int i = 0; i < count; i++) {
            moneyStr = "零" + moneyStr;
        }
//        System.out.println(moneyStr);
        //插入单位
        //定义一个数组表示单位
        String[] arr = {"佰","拾","万","仟","佰","拾","元"};
        String result = "";
        for (int i = 0; i < moneyStr.length(); i++) {
            char c = moneyStr.charAt(i);
            result = result + c + arr[i];
        }
        System.out.println(result);

    }
    public static String getCapitalNumber(int number){
        String[] arr = {"零","壹","贰","叁","肆","伍", "陆", "柒", "捌", "玖"};
        return arr[number];
    }
}
