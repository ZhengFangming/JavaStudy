package com.itheima.oopTest5;

public class GirlFriendTest {
    public static void main(String[] args) {
        //1.定义数组存储4个女朋友的对象
        GirlFriend[] arr = new GirlFriend[4];
        GirlFriend gf1 = new GirlFriend("Amy",18,"Female","reading");
        GirlFriend gf2 = new GirlFriend("Betty",19,"Female","swimming");
        GirlFriend gf3 = new GirlFriend("Candy",20,"Female","Gaming");
        GirlFriend gf4 = new GirlFriend("Durex",21,"Female","running");

        arr[0] = gf1;
        arr[1] = gf2;
        arr[2] = gf3;
        arr[3] = gf4;

        //2.计算四女朋友的平均年龄
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i].getAge();
        }
        //计算平均值
        int avg = sum / arr.length;
        System.out.println("四女朋友的平均年龄为" + avg);
        //统计年龄比平均值低的女朋友有几个
        //并打印出来她们的信息
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i].getAge() < avg){
               count++;
               System.out.println(arr[i].getName() + ", " + arr[i].getAge() + ", " + arr[i].getGender() + ", " + arr[i].getHobby());
           }
        }
        System.out.println("统计年龄比平均值低的女朋友有" + count + "个");
    }
}
