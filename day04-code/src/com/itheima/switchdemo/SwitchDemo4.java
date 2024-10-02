package com.itheima.switchdemo;

public class SwitchDemo4 {
    public static void main(String[] args) {
        /*
        switch新特性
        jdk12
        由于原始的switch语句体太过麻烦复杂,因此在jdk12后加入新特性用以下形式来表示

        switch(){
            case 1 -> {
            System.out.println();
            }
        但是在语句体只有一句时可以省略大括号
        }
         */
        int number = 1;
        switch(number){
            case 1 -> System.out.println("一");
            case 2 -> System.out.println("二");
            case 3 -> System.out.println("三");
            default -> System.out.println("没有这种选项");
        }

    }
}
