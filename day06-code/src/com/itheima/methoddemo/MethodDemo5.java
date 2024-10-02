package com.itheima.methoddemo;

public class MethodDemo5 {
    public static void main(String[] args) {
        //目标：掌握带返回值方法的定义和调用格式

        System.out.println(getSum(1,2,3));
    }


    public static int getSum(int num1, int num2, int num3){
        int result = num1 + num2 + num3;
        return result;
    }
}
