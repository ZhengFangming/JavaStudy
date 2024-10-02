package test;

public class LoopTest4 {
    public static void main(String[] args) {
        //优化LoopTest3
        //如果使用LoopTest3的思路，当需要判断的数过大时需要循环次数过多，代码运行效率较低
        //推荐一种简化思路
        //81 = 1 * 81 = 3 * 27 = 9 * 9

        //以81的平方根9为中心
        //假设a*b = 81
        //那么a和b中必有一个是必定小于等于9的，另外一个大于9

        int number = 100;
        //如果这个范围内，所有的数字都不能被number整除
        //那么这个number就一定是一个质数
//        for(int i = 2; i <= number的平方根; i++){
//
//        }
    }
}
