package com.itheima.arithmeticoperator;

public class ArithmeticoperatorDemo2 {
    public static void main(String[] args) {
        //除法
        System.out.println(10/2);
        System.out.println(10/3);
        System.out.println(10.0/3);

        //取余, 取模, 实际上也是在做除法运算,不过得到的是余数而已。
        System.out.println(10%2);
        System.out.println(10%3);

        //应用场景
        //1. 可以用取模来判断A是否能被B整除
        //A%B   10%3
        //2. 可以判断A是否为偶数
        //A%2如果结果为0,则A是偶数, 若结果不为0, 则A是奇数
        //3. 在以后, 斗地主发牌
        //三个玩家
        //把每一张牌都定义一个序号
        //拿着序号 % 3,如果结果为1则发给第一个玩家
        //结果为2发给第二个玩家
        //结果为0则发给第三个玩家

    }
}
