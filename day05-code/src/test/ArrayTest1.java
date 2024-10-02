package test;

public class ArrayTest1 {
    public static void main(String[] args) {
        /*
        定义一个数组,存储1,2,3,4,5
        遍历数组得到每一个元素,求数组里面所有的数据和
         */

        //1.定义数组并存储1,2,3,4,5
        int[] arr = {1,2,3,4,5};
        int sum = 0;//定义一个变量来接受数组中元素相加的和

        //2.遍历数组并将数组中的元素加在sum变量中求和
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("数组里所有的元素和为" + sum);
    }
}
