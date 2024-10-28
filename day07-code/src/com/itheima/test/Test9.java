package com.itheima.test;

import java.util.Random;

public class Test9 {
    public static void main(String[] args) {
        /*
        需求：
        一个大V直播抽奖，奖品是现金红包，分别有{2, 588 , 888, 1000, 10000}五个奖金。
        请使用代码模拟抽奖，打印出每个奖项，奖项的出现顺序要随机且不重复。
        打印效果如下：（随机顺序，不一定是下面的顺序）
            888元的奖金被抽出
            588元的奖金被抽出
            10000元的奖金被抽出
            1000元的奖金被抽出
            2元的奖金被抽出
         */

        //1.分析
        //定义一个数组来表明奖池
        int[] arr = {2,588,888,1000,10000};
        //2.再定义新数组用于存储抽奖的结果
        int[] newArr = new int[arr.length];
        //3.抽奖
        Random r = new Random();
        //因为有5个奖项，所以这里循环5次
        for (int i = 0; i < 5; i++) {
            //获取随机索引
            int randomIndex = r.nextInt(arr.length);
            //获取奖项
            int prize = arr[randomIndex];
            //判断奖项是否存在，如果存在则重新抽取，如果不存在，就表示有效奖项
            //定义一个方法来判断奖项是否存在
            boolean flag = contains(newArr,prize);
            if(!flag){
                newArr[i] = prize;
                i++;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.println(newArr[i]);
        }

    }

    public static boolean contains(int[] arr,int prize){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == prize){
                return true;
            }
        }
        return false;
    }
}
