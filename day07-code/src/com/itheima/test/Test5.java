package com.itheima.test;

import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        //需求：在唱歌比赛中，有6名评委给选手打分，分数范围是[0 - 100]之间的整数。
        //选手的最后得分为：去掉最高分、最低分后的4个评委的平均分，请完成上述过程并计算出选手的得分。

        //分析：
        //1.定义一个数组用来存储6名评委的打分
        //定义一个方法用来获取键盘录入的评委的打分
        int[] scores = getScore();
        for (int i = 0; i < scores.length; i++) {
            System.out.println(scores[i]);
        }
        //求出数组中的最大值
        //定义一个方法来获得数组中的最大值
        int max = getMax(scores);
        //求出数组中的最小值
        //定义一个方法来获得数组中的最小值
        int min = getMin(scores);
        //通过将数组中所有的数相加并且减去max和min值再除以4得到平均分
        int sum = 0;
        int avg = 0;
        for (int i = 0; i < scores.length; i++) {
            sum = sum + scores[i];
        }
        avg = (sum - max - min) / (scores.length - 2);
        System.out.println("此选手的平均分为" + avg);

    }

    public static int[] getScore() {
        //键盘录入评委的打分，范围在0~100
        int[] arr = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; ) {
            System.out.println("请输入评委的打分");
            int score = sc.nextInt();
            if (score >= 0 && score <= 100) {
                arr[i] = score;
                i++;
            } else {
                System.out.println("成绩超出了范围，继续录入，当前为第" + i + "评委的打分");
            }
        }
        return arr;
    }

    //求数组最大值的方法
    public static int getMax(int[] scores) {
        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= max) {
                max = scores[i];
            }
        }
        return max;
    }

    public static int getMin(int[] scores) {
        int min = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] <= min) {
                min = scores[i];
            }
        }
        return min;
    }
}
