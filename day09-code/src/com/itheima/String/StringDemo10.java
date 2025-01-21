package com.itheima.String;

import java.util.Scanner;

public class StringDemo10 {
    public static void main(String[] args) {
        /* 需求1：键盘录入一个 字符串，如果字符串中包含（TMD），则使用***替换
        //1. 定义一个变量表示骂人的话
        String talk = "后羿你玩什么呀,TMD";

        //2. 然后把这句话进行敏感句替换
        String result = talk.replace("TMD","***");
        System.out.println(talk);
        System.out.println(result);
         */
        //需求2: 如果要替换的敏感词比较多怎么办
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要说的话");
        String talk = sc.next();

        //可以定义一个数组用来存多个敏感词
        String[] arr = {"TMD","ZZ","ctmd","lj","FW","NT"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i],"***");
        }
        System.out.println(talk);

    }
}
