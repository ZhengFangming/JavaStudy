package test;

public class Test13 {
    public static void main(String[] args) {
        //短线重连

        //分析:
        //因为我们需要重复执行某段代码,所以需要用循环解决
        //循环次数5次
        //开始条件:1
        //结束条件:5

        for(int i = 1; i <= 5; i++){
            System.out.println("第"+i+"次执行短线重连的业务逻辑");
        }

    }
}
