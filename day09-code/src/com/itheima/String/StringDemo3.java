package com.itheima.String;

import java.util.Scanner;

public class StringDemo3 {
    public static void main(String[] args) {
        //1. 定义两个变量用来记录正确的用户名和密码
        String rightUsername = "itheima";
        String rightPassword = "password";

        //2. 键盘录入用户名和密码
        //ctrl + alt + T选择包裹方式
        for (int i = 0;i < 3; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String username = sc.next();
            System.out.println("请输入密码:");
            String password = sc.next();

            //3. 判断比较
            if(username.equals(rightUsername) && password.equals(rightPassword)){
                System.out.println("登录成功!");
                //如果正确, 循环结束
                break;
            }else{
                //如果是最后一次机会
                if(i == 2){
                    System.out.println("账户" + username + "被锁定, 请联系相关工作人员.");
                }else{
                    //不是最后一次机会
                    System.out.println("用户名或密码错误, 登录失败,还剩下" + (2-i) + "次机会");
                }
            }
        }


    }
}
