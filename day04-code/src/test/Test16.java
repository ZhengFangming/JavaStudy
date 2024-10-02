package test;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args) {
        //需求:键盘录入两个数字,表示一个范围
        //统计这个范围中既能被三整除,又能被5整除的数字有多少个?

        //分析:键盘录入两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请录入一个数字表示范围的开始");
        int start = sc.nextInt();
        System.out.println("请录入一个数字表示范围的结束");
        int end = sc.nextInt();

        //利用循环获取这个范围中的每一个数字
        //开始条件:Start
        //结束条件:end
        for(int i = start; i <= end; i++){
            //对每一个数字进行判断看是否符合条件
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println(i);
            }
        }


    }
}
