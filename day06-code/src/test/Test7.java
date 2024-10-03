package test;

public class Test7 {
    public static void main(String[] args) {
        //需求：判断一个数字是否在数组中存在
        //1.定义数组
        int[] arr = {1,5,8,12,56,89,34,67};
        //2.判断一个数字是否在数组中存在
        boolean flag = contains(arr,89);
        System.out.println(flag);
    }

    public static boolean contains(int[] arr, int number){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == number){
                return true;
            }
        }
        //什么时候才能断定数字在数组中是不存在的
        //当数组中所有的数字都比较过后才可以断定

        return false;
    }

}

//return break关键字的区别
//return：其实跟循环没有什么关系，跟方法有关的，表示1结束方法 2返回结果
//        如果方法执行到了return，那么整个方法全部结束，里面的循环也会随之结束了。

//break关键字
//其实跟方法没有什么关系，结束循环和switch有关的。
