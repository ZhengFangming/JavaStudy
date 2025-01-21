package com.itheima.a03staticdemo3;

import java.util.ArrayList;

public class StudentTest {
    public static void main(String[] args) {
        //创建一个集合来存储学生对象
        ArrayList<Student> list = new ArrayList<>();

        Student s1 = new Student("Zhangsan", "male", 18);
        Student s2 = new Student("Lisi", "female", 19);
        Student s3 = new Student("Wangwu", "male", 20);

        //将学生对象添加到集合当中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAgeStudent = StudentUtil.getMaxAgeStudent(list);
        System.out.println(maxAgeStudent);
    }
}
