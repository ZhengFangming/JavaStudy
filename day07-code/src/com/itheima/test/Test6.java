package com.itheima.test;

public class Test6 {
    public static void main(String[] args) {
        //需求：某系统的数字密码（大于0），比如1983，采用加密方式进行传输。
        //规则如下：
        //先得到每位数，然后每位数都加上5 , 再对10求余，最后将所有数字反转，得到一串新数。
        /*举例：
        		1	9	8	3
        +5		6   14  13  8
        %10		6   4   3   8
        反转	8   3   4   6
        加密后的结果就是：8346
         */

        //分析：
        //1.将例子中的数字置入数组中
        int[] arr = {1, 9, 8, 3};
        //加密
        //+5
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 5;
        }
        //%10
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] % 10;
        }
        //反转
       for(int i = 0, j = arr.length - 1; i < j; i++,j--){
           int temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
       }

       //将数组里面的每一个数字进行拼接，变成加密之后的结果
        int number = 0;
        for (int i = 0; i < arr.length; i++) {
            number = number * 10 + arr[i];

        }
        System.out.println(number);

    }
}
