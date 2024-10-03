package test;

public class Test6 {
    public static void main(String[] args) {
        //需求：设计一个方法求数组的最大值，并将最大值返回
        //1.定义数组
        int[] arr = {1,3,5,7,9};
        //2.调用方法求最大值
        int max = getMax(arr);

        //3.打印
        System.out.println(max);
    }

    public static int getMax(int[] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }


}
