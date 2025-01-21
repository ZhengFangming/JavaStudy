package com.itheima.a02staticdemo2;

public class Test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        String str = ArrayUtil.printArr(arr);
        System.out.println(str);

        double[] arr2 = {1.2, 2.4, 3.6, 4.8, 5.0};
        double avg = ArrayUtil.getArrAvg(arr2);
        System.out.println(avg);
    }
}
