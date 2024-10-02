package test;

public class ArrayTest2 {
    public static void main(String[] args) {
        /*
        定义一个数组,存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素,统计数组里面一共有多少个能被三整除的数字
         */

        //1.定义数组并存储1,2,3...
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //定义一个计数变量记录能被三整除的元素的个数
        int count = 0;
        //遍历整个数组
        for (int i = 0; i < arr.length; i++) {
            //通过条件语句来判断数组中元素能否被3整除
            if(arr[i] % 3 == 0){
                count++;
            }

        }
        //count中的数就是数组中元素能被3整除的个数
        System.out.println(count);

    }
}
