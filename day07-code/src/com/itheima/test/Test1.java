package com.itheima.test;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        /*
        机票价格按照淡季旺季、头等舱和经济舱收费、输入机票原价、月份和头等舱或经济舱。
        按照如下规则计算机票价格：旺季（5-10月）头等舱9折，经济舱8.5折，
        淡季（11月到来年4月）头等舱7折，经济舱6.5折。
        */

        //1.首先用键盘录入输入机票价格，月份和舱位
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入票面价格：");
        int ticket = sc.nextInt();
        System.out.println("请输入出行月份");
        int month = sc.nextInt();
        System.out.println("请输入舱位等级:(头等舱请输入: 0 ; 经济舱请输入: 1 )");
        int grade = sc.nextInt();

        if (month >= 5 && month <= 10) {
            ticket = getTicket(grade, ticket, 0.9, 0.85);
        } else if ((month >= 11 && month <= 12) || (month >= 1 && month <= 4)) {
            ticket = getTicket(grade, ticket, 0.7, 0.65);
        }
        System.out.println(ticket);


    }

    private static int getTicket(int grade, int ticket, double x, double x1) {
        if (grade == 0) {
            ticket = (int) (x * ticket);
        } else if (grade == 1) {
            ticket = (int) (x1 * ticket);
        } else {
            System.out.println("舱位输入有误");
        }
        return ticket;
    }


    //2.定义一个方法getTicket来使用规则计算机票价格
    //个人解法:方法一般在需要多次调用的情况下才需要定义
    /*public static int getTicket(int ticket, int month, int grade) {
        int finalTicket = 0;
        if (month >= 5 && month <= 10) {
            if (grade == 0) {
                finalTicket = (int) (0.9 * ticket);
            } else if (grade == 1) {
                finalTicket = (int) (0.85 * ticket);
            } else {
                System.out.println("舱位输入有误");
            }
        } else if ((month >= 11 && month <= 12) || (month >= 0 && month <= 4)) {
            if (grade == 0) {
                finalTicket = (int) (0.7 * ticket);
            } else if (grade == 1) {
                finalTicket = (int) (0.65 * ticket);
            } else {
                System.out.println("舱位输入有误");
            }
        }
        return finalTicket;
    }*/


}
