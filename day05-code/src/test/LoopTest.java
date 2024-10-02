package test;

public class LoopTest {
    public static void main(String[] args) {
        //逢7过游戏:从1开始报数,每当要报的数字中含7或者是7的倍数都要说:过
        //需求:使用程序控制在控制台打印出1-100之间的满足逢7必过的数据

        //1.得到1-100内每一个数字
        //开始:1
        //结束:100
        for (int i = 1; i <= 100; i++) {
            //System.out.println(i);
            if(i % 10 == 7 || i / 10 % 10 == 7 || i % 7 == 0){
                System.out.println("过");
                continue;
            }
            System.out.println(i);
        }

    }
}
