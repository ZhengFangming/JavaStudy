package test;

public class Test17 {
    public static void main(String[] args) {
        /*
        需求:世界最高峰位珠穆朗玛峰(8844.43米=8844430毫米),假如我有一张足够大的纸厚度为0.1毫米
        折叠多少次可以厚度超过珠穆朗玛峰的高度

        分析:折叠纸张,每一次折叠纸张都是厚度变为原来的两倍
        double a = 0.1;
        a = a*2;
        a*= 2;

         */

        //定义一个变量用来记录山峰的高度
        double height = 8844430;
        //定义一个变量用来记录纸张的初始厚度
        double paper = 0.1;
        //定义一个变量用来统计次数
        int count = 0;
        //循环折叠纸张,只要纸张的厚度小于山峰的高度,那么循环就继续
        while(paper < height){
            paper = paper*2;
            count++;

        }
        System.out.println(count);
    }
}
