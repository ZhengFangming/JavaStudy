package test;

public class ArrayTest3 {
    public static void main(String[] args) {
        /*
        定义一个数组,存储1,2,3,4,5,6,7,8,9,10
        遍历数组得到每一个元素
        要求:
        1. 如果是奇数,则将当前的数字扩大两倍
        2. 如果是偶数,则将当前的数字变为原来的二分之一
         */

        //1.定义一个数组并且存储1,2,3,4,5,6,7,8,9,10
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        //2.遍历数组的每一个元素
        //若遍历到的元素为奇数将其扩大两倍
        //若遍历到的元素为偶数则将其除以2
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0){
                arr[i] = arr[i] / 2;
            }else if(arr[i] % 2 != 0){
                arr[i] = arr[i] * 2;
            }
        }
        //遍历更改后的数组并且打印每一个元素
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
