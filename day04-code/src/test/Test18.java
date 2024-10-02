package test;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args) {
        //需求：给你一个整数X. 如果x是一个回文整数,打印true,否则,返回false
        //解释: 回文数是指正序和倒序读都是一样的整数.
        //例如: 121是回文而123不是

        //第一步:定义一个整数x
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个整数");
        int x = sc.nextInt();
        //第二步:将获得的整数赋值给一个临时变量temp用来和倒序的x进行对比
        int temp = x;
        int num = 0;//定义num用来构造倒序的x
        //第三步:通过while循环(因为不知道何时循环结束因此不能用for循环)
        //循环体构建需要通过取模和左移来构建,循环的停止条件为x不能等于0.
        while(x != 0){
            //首先对个位取模
            int ge = x % 10;
            //然后将整数的小数点左移
            x = x / 10;
            //把取模得出的数加到num中
            num = num * 10 + ge;

        }
        System.out.println(num);
        System.out.println(temp == num);


    }
}
