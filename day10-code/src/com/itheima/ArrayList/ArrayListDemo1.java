package com.itheima.ArrayList;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> array = new ArrayList<String>();

        //添加元素
        array.add("hello");
        array.add("world");
        array.add("Java");
        System.out.println(array.set(1,"nihao"));

        System.out.println("array: " + array);
    }
}
