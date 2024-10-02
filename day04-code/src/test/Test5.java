package test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        /* 假设某影院卖了100张票，序号为1~100.
        奇数票号坐左边，偶数票号坐右边
        键盘录入一个整数表示电影票的票号
        根据不同情况，给出不同的提示：
        如果票号为奇数，那么打印坐左边
        如果票号为偶数，那么打印坐右边
         */

        //分析
        //1. 键盘录入一个整数表示电影票的票号。
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个票号");
        int ticket = sc.nextInt();
        //只有当票号为1~100时，才是真实有效的票
        if(ticket >= 0 && ticket <= 100){
            if(ticket % 2 == 1){
                System.out.println("坐左边");
            }else{
                System.out.println("坐右边");
            }
        }
    }
}
