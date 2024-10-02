package test;

import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        /*
        需求：假设，用户在超市进行购买，商品的总价为600元。
        键盘录入一个整数表示用户实际支付的钱
        如果付款大于等于600，表示付款成功，否则表示付款失败
         */

        //分析：
        //1. 键盘录入一个整数表示用户实际支付的钱。
        Scanner sc = new Scanner(System.in);
        System.out.println("录入一个整数表示实际支付的钱");
        int money = sc.nextInt();
        //2. 判断
        if(money >= 600){
            System.out.println("付款成功");
        }else{
            System.out.println("付款失败");
        }


    }
}
