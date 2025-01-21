package com.itheima.oopTest;

public class GameTest {
    public static void main(String[] args) {
        //1.创建第一个角色
        Role r1 = new Role("乔峰",100,'男');
        Role r2 = new Role("鸠摩智",100,'男');

        //展示一下角色信息
        r1.showRoleInfo();
        r2.showRoleInfo();
        //开始游戏
        while(true){
            r1.attack(r2);
            if(r2.getBlood() == 0){
                System.out.println(r1.getName() + "K.O了" + r2.getName());
                break;
            }


            r2.attack(r1);
            if(r1.getBlood() == 0){
                System.out.println(r2.getName() + "K.O了" + r1.getName());
                break;
            }
        }
    }
}
