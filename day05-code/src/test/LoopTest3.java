package test;

import java.util.Scanner;

public class LoopTest3 {
    public static void main(String[] args) {
        //需求：键盘录入一个正整数x，判断该整数是否是一个质数。

        //质数：如果一个数只能被1或者它本身所整除，那么这个数就是质数，否则这个数叫合数

        //分析：
        //1，键盘录入一个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int number = sc.nextInt();

        //定义一个变量，表示标记
        //标记着number是否是一个质数、true是一个质数、false不是一个质数
        boolean flag = true;

        //2.判断
        //写一个循环，从2开始判断，一直判断到number-1为止
        //看这个范围内，有没有数字可以被number整除
        for (int i = 2; i < number; i++) {
            //i依次表示范围内的每一个数字
            //看number是否能被i整除
            if(number % i == 0){
                flag = false;
                //System.out.println(number+"是一个质数");
                break;
            }//后面不能用else
        }

        //只有当这个循环结束了，表示这个范围内的所有数字都判断完了
        //此时才能断定number是一个质数
        if(flag){
            System.out.println(number+"是一个质数");
        }else{
            System.out.println(number+"不是一个质数");
        }
    }
}
